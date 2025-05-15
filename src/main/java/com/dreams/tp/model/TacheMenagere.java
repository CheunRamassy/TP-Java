package com.dreams.tp.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tacheMenagere")
@Inheritance(strategy = InheritanceType.JOINED)
public class TacheMenagere extends Tache {

    @ManyToMany(mappedBy = "tacheMenageres")
    private Set<Produit> produits;

    public Set<Produit> getProduits() {
        return produits;
    }

    private String titre;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}