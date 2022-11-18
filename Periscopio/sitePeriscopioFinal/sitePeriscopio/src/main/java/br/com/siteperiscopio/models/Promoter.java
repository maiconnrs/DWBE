package br.com.siteperiscopio.models;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class Promoter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPromoter;
    private String name;
    private String email;
    private int password;


    public Promoter() {
    }


    public Promoter(int idPromoter, String name, String email, int password) {
        this.idPromoter = idPromoter;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getIdPromoter() {
        return idPromoter;
    }

    public void setIdPromoter(int idPromoter) {
        this.idPromoter = idPromoter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
