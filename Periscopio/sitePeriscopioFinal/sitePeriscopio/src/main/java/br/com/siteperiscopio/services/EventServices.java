package br.com.siteperiscopio.services;

import br.com.siteperiscopio.models.Event;
import br.com.siteperiscopio.repository.RepositoryEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EventServices {

    @Autowired
    private RepositoryEvent repositoryEvent;


    public void insertEvent(Event event){
        repositoryEvent.save(event);
    }

    public void deleteEvent(Event event){
        repositoryEvent.delete(event);
    }



    public List<Event> getAllEvents(){
        return repositoryEvent.findAll();
    }

    public Optional<Event> getEventById(Integer id){
        return repositoryEvent.findById(id);
    }

    public void updateEventById (Integer id, Event event){
        Optional<Event> eventSearched = getEventById(id);
        eventSearched.get().setEventDate(event.getEventDate());
        eventSearched.get().setEventDescription(event.getEventDescription());
        eventSearched.get().setEventStartTime(event.getEventStartTime());
        eventSearched.get().setEventEndTime(event.getEventEndTime());
    }

    public List<Event> getEventsByCityId(Integer cityId){
        List<Event> allEventsList = getAllEvents();
        List<Event> eventsByCityList = new ArrayList<>();

        for (Event event: allEventsList) {
            if(event.getPlace().getCityId() == cityId){
                eventsByCityList.add(event);
            }
        }
        return eventsByCityList;
    }

    public List<Event> getEventsByDate(String dataEvent, Integer idCity){
        List<Event> eventsAtCity = getEventsByCityId(idCity);
        List<Event> eventsByDate = new ArrayList<>();

        for (Event event: eventsAtCity) {
            if(event.getEventDate() == dataEvent){
                eventsByDate.add(event);
            }
        }
        return eventsByDate;
    }

    public List<Event> getEventsByPlaceType(String typePlace, Integer idCity){
        List<Event> eventsAtCity = getEventsByCityId(idCity);
        List<Event> eventsByTypePlace = new ArrayList<>();

        for (Event event: eventsAtCity) {
            if(event.getPlace().getTypePlace() == typePlace){
                eventsByTypePlace.add(event);
            }
        }
        return eventsByTypePlace;
    }







}
