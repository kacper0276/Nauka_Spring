package com.example.todoapp.model;

import com.example.todoapp.model.projection.ProjectWriteModel;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    List<Project> findAll();

    Optional<Project> findById(Integer id);

    Project save(Project entity);
}