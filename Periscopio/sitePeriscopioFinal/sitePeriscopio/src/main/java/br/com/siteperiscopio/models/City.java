package br.com.siteperiscopio.models;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCity;
    private String cityName;


    public City() {
    }

    public City(int idCity, String cityName) {
        this.idCity = idCity;
        this.cityName = cityName;
    }


    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
