package br.com.siteperiscopio.controller;

import br.com.siteperiscopio.models.Event;
import br.com.siteperiscopio.models.FunHouse;
import br.com.siteperiscopio.services.EventServices;
import br.com.siteperiscopio.services.FunHouseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funhouse")
public class FunHouseController {
    @Autowired
    private FunHouseServices funHouseServices;
    @GetMapping("/{id}")
    public Optional<FunHouse> getFunHouse(@PathVariable("id") Integer id){
        return funHouseServices.getFunHouseById(id);
    }
    @GetMapping("/cidade/{id}")
    public List<FunHouse> getFunHouseByCity(@PathVariable("id") Integer id){
        return funHouseServices.getFunHouseByCityId(id);
    }
    @GetMapping("/{typePlace}/{id}")
    public List<Event> getFunHouseByTypePlace(@PathVariable("typePlace", id) String typePlace, Integer id){
        return funHouseServices.getFunHousesByPlaceType("typePlace", id);
    }
    @PostMapping("/novo")
    public ResponseEntity<Event> addFunHouse(@NonNull @Validated @RequestBody FunHouse f){
        funHouseServices.insertFunHouse(f);
        return new ResponseEntity<>(f, HttpStatus.OK);
    }


    @GetMapping("")
    public ResponseEntity<List<FunHouse>> getALLFunHouse(){
        return new ResponseEntity<>(funHouseServices.getAllFunHouses(), HttpStatus.OK);
    }

    /* delete funHouse ; update funhouse by id ; corrigir rotas que precisam de dois parametros */
}
