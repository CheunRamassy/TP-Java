package com.dreams.tp.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @ManyToOne
    private Tache tache;

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {this.tache = tache;}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String password;
    private Date date_de_creation;
    private Date date_de_modification;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate_de_creation() {
        return date_de_creation;
    }

    public void setDate_de_creation(Date date_de_creation) {
        this.date_de_creation = date_de_creation;
    }

    public Date getDate_de_modification() {
        return date_de_modification;
    }

    public void setDate_de_modification(Date date_de_modification) {
        this.date_de_modification = date_de_modification;
    }

    public void setId(Long id) {
        this.id = id;
    }

}