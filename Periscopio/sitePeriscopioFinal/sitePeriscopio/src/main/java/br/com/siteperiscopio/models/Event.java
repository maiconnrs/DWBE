package br.com.siteperiscopio.models;

import javax.persistence.*;

@Entity
@Table(name = "funHouse")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEvent;
    private String nameEvent;
    private String eventDescription;
    private String eventDate;
    private String eventStartTime;
    private String eventEndTime;
    private Promoter promoter;
    private Place place;

    public Event() {
    }

    public Event(int idEvent, String nameEvent, String eventDescription, String eventDate, String eventStartTime, String eventEndTime, Promoter promoter, Place place) {
        this.idEvent = idEvent;
        this.nameEvent = nameEvent;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.promoter = promoter;
        this.place = place;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(String eventEndTime) {
        this.eventEndTime = eventEndTime;
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
