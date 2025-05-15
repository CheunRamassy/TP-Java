package com.dreams.tp.repository;

import com.dreams.tp.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "Utilisateur")
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}