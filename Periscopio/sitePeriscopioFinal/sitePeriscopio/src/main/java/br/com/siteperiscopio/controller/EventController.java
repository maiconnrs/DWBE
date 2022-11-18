package br.com.siteperiscopio.controller;

import br.com.siteperiscopio.models.Event;
import br.com.siteperiscopio.services.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/eventos")
public class EventController {
    @Autowired
    private EventServices eventServices;

    @GetMapping("/{id}")
    public Optional<Event> getEvent(@PathVariable("id") Integer id){
        return eventServices.getEventById(id);
    }
    @GetMapping("/eventoscidade/{id}")
    public List<Event> getEventByCity(@PathVariable("id") Integer id){
        return eventServices.getEventsByCityId(id);
    }
    @GetMapping("/eventoscidade/{data}/{id}")
    public List<Event> getEventByCity(@PathVariable("data", id) String data, Integer id){
        return eventServices.getEventsByDate("data", id);
    }
    @GetMapping("/eventoscidade/{typePlace}/{id}")
    public List<Event> getEventByTypePlace(@PathVariable("typePlace", id) String typePlace, Integer id){
        return eventServices.getEventsByPlaceType("typePlace", id);
    }
    @PostMapping("/novo")
    public ResponseEntity<Event> addEvento(@NonNull @Validated @RequestBody Event e){
        eventServices.insertEvent(e);
        return new ResponseEntity<>(e, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public Optional<Event> updateEvent(@NonNull @Validated @RequestBody Event e,
                                                     @PathVariable Integer id){

        Event eSearch = eventServices.getEventById(id);

        if (eventServices == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        e.setCodigo(eSearch.getCodigo());
        eventServices.saveEvent(e);

        return new ResponseEntity<>(e, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Event> deleteEvent(@NonNull @Validated @PathVariable Integer id){

        Event e = eventServices.getEventById(id);

        if (e == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        eventServices.removerEvent(e);
        return new ResponseEntity<>(e, HttpStatus.OK);
    }

    /* Corrigir rotas que precisam de 2 parametros*/
}
