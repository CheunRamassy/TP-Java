package com.dreams.tp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tacheCourse")
@Inheritance(strategy = InheritanceType.JOINED)
public class TacheCourse extends Tache {

    private String nomArticle;
    private Integer nombreArticle;

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public Integer getNombreArticle() {
        return nombreArticle;
    }

    public void setNombreArticle(Integer nombreArticle) {
        this.nombreArticle = nombreArticle;
    }
}