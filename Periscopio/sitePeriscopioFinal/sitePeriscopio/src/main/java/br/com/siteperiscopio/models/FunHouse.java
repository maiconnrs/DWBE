package br.com.siteperiscopio.models;

import javax.persistence.*;

@Entity
@Table(name = "funHouse")
public class FunHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFunHouse;
    private String nameFunHouse;
    private String typeFunHouse;
    private String urlDigitalMenu;
    private String urlJuckebox;
    private String urlFotos;
    private Promoter promoter;
    private Place place;


    public FunHouse() {
    }

    public FunHouse(int idFunHouse, String nameFunHouse, String typeFunHouse, String urlDigitalMenu, String urlJuckebox, String urlFotos, Promoter promoter, Place place) {
        this.idFunHouse = idFunHouse;
        this.nameFunHouse = nameFunHouse;
        this.typeFunHouse = typeFunHouse;
        this.urlDigitalMenu = urlDigitalMenu;
        this.urlJuckebox = urlJuckebox;
        this.urlFotos = urlFotos;
        this.promoter = promoter;
        this.place = place;
    }

    public int getIdFunHouse() {
        return idFunHouse;
    }

    public void setIdFunHouse(int idFunHouse) {
        this.idFunHouse = idFunHouse;
    }

    public String getNameFunHouse() {
        return nameFunHouse;
    }

    public void setNameFunHouse(String nameFunHouse) {
        this.nameFunHouse = nameFunHouse;
    }

    public String getTypeFunHouse() {
        return typeFunHouse;
    }

    public void setTypeFunHouse(String typeFunHouse) {
        this.typeFunHouse = typeFunHouse;
    }

    public String getUrlDigitalMenu() {
        return urlDigitalMenu;
    }

    public void setUrlDigitalMenu(String urlDigitalMenu) {
        this.urlDigitalMenu = urlDigitalMenu;
    }

    public String getUrlJuckebox() {
        return urlJuckebox;
    }

    public void setUrlJuckebox(String urlJuckebox) {
        this.urlJuckebox = urlJuckebox;
    }

    public String getUrlFotos() {
        return urlFotos;
    }

    public void setUrlFotos(String urlFotos) {
        this.urlFotos = urlFotos;
    }

    public Promoter getPromoter() {
        return promoter;
    }

    public void setPromoter(Promoter promoter) {
        this.promoter = promoter;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
