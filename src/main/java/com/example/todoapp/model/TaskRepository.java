package com.example.todoapp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // (path = "todos", collectionResourceRel = "todos") collectionResourceRel - jak powinien być opisywany w kolekcji
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
