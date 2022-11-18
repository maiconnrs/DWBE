package br.com.siteperiscopio.models;


import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPlace;
    private int cityId;
    private String namePlace;
    private String typePlace;
    private String cep;
    private String street;
    private int number;
    private String district;


    public Place() {
    }

    public Place(int idPlace, int cityId, String namePlace, String typePlace, String cep, String street, int number, String district) {
        this.idPlace = idPlace;
        this.cityId = cityId;
        this.namePlace = namePlace;
        this.typePlace = typePlace;
        this.cep = cep;
        this.street = street;
        this.number = number;
        this.district = district;
    }


    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public String getTypePlace() {
        return typePlace;
    }

    public void setTypePlace(String typePlace) {
        this.typePlace = typePlace;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
