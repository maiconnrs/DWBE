package br.com.siteperiscopio.services;

import br.com.siteperiscopio.models.Event;
import br.com.siteperiscopio.models.FunHouse;
import br.com.siteperiscopio.repository.RepositoryFunHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FunHouseServices {

    @Autowired
    private RepositoryFunHouse repositoryFunHouse;

    public void insertFunHouse(FunHouse funHouse){
        repositoryFunHouse.save(funHouse);
    }

    public void deleteFunHouse(FunHouse funHouse){
        repositoryFunHouse.delete(funHouse);
    }

    public List<FunHouse> getAllFunHouses(){
        return repositoryFunHouse.findAll();
    }

    public Optional<FunHouse> getFunHouseById(Integer id){
        return repositoryFunHouse.findById(id);
    }

    public void updateFunHouse (Integer id, FunHouse funHouse){
        Optional<FunHouse> funHouseSearched = getFunHouseById(id);
        funHouseSearched.get().setNameFunHouse(funHouse.getNameFunHouse());
        funHouseSearched.get().setTypeFunHouse(funHouse.getTypeFunHouse());
    }

    public List<FunHouse> getFunHouseByCityId(Integer cityId) {
        List<FunHouse> allFunHouseList = getAllFunHouses();
        List<FunHouse> funHouseByCityList = new ArrayList<>();

        for (FunHouse funHouse : allFunHouseList) {
            if (funHouse.getPlace().getCityId() == cityId) {
                funHouseByCityList.add(funHouse);
            }
        }
        return funHouseByCityList;
    }

    public List<FunHouse> getFunHousesByPlaceType(String typePlace, Integer idCity){
        List<FunHouse> funHousesAtCity = getFunHouseByCityId(idCity);
        List<FunHouse> funHousesByTypePlace = new ArrayList<>();

        for (FunHouse funHouse: funHousesAtCity) {
            if(funHouse.getPlace().getTypePlace() == typePlace){
                funHousesByTypePlace.add(funHouse);
            }
        }
        return funHousesByTypePlace;
    }
}
