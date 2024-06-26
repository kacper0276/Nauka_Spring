package com.example.todoapp.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();
    Page<Task> findAll(Pageable page);
    Optional<Task> findById(Integer i);
    Task save(Task entity);
    boolean existsById(Integer id);
    boolean existsByDoneIsFalseAndGroup_Id(Integer groupId);
    List<Task> findByDoneIsTrue(); // LUB List<Task> findByDone(@Param("state") boolean done);
    List<Task> findByDone(boolean done);

    List<Task> findAllByGroup_Id(Integer groupId);
}
