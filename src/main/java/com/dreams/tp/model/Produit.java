package com.dreams.tp.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "produit")
public class Produit {

    @ManyToMany
    private Set<TacheMenagere> tacheMenageres;

    public Set<TacheMenagere> getTacheMenageres() {
        return tacheMenageres;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
}