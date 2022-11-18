package br.com.siteperiscopio.services;


import br.com.siteperiscopio.models.Event;
import br.com.siteperiscopio.models.Place;
import br.com.siteperiscopio.repository.RepositoryEvent;
import br.com.siteperiscopio.repository.RepositoryPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("placeServices")
public class PlaceServices {

    @Autowired
    private RepositoryPlace repositoryPlace;

    public void insertPlace(Place place){
        repositoryPlace.save(place);
    }

    public void deleteEvent(Place place){
        repositoryPlace.delete(place);
    }

    public List<Place> getAllPlaces() {
        return repositoryPlace.findAll();
    }



    public List<Integer> getPlacesByCityId(Integer cityId){

        List<Place> placesList = getAllPlaces();
        List<Integer> idPlaceList = new ArrayList<>();

        for (Place place: placesList) {
            if (place.getCityId() == cityId){
                idPlaceList.add(place.getCityId());
            }
        }
        return idPlaceList;

    }


}
