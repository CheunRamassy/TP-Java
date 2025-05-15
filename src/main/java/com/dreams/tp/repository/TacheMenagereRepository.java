package com.dreams.tp.repository;

import com.dreams.tp.model.TacheMenagere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "TacheMenagere")
public interface TacheMenagereRepository extends JpaRepository<TacheMenagere, Long> {
}