package com.dreams.tp.repository;

import com.dreams.tp.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "Produit")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}