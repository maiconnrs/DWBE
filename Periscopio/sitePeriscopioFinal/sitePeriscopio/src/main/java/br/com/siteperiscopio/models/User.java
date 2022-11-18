package br.com.siteperiscopio.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAluno;
    private String name;
    private String dataNascimento;
    private String sexo;
    private String email;
    private String password;
    private int idCity;


    public User() {
    }

    public User(int idAluno, String name, String dataNascimento, String sexo, String email, String password) {
        this.idAluno = idAluno;
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.password = password;
        this.idCity = 0;
    }


    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }
}
