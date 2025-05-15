package com.dreams.tp.repository;

import com.dreams.tp.model.TacheCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "TacheCourse")
public interface TacheCourseRepository extends JpaRepository<TacheCourse, Long> {
}