package com.dreams.tp.repository;

import com.dreams.tp.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "TacheRepository")
public interface TacheRepository extends JpaRepository<Tache, Long> {
}