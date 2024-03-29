package com.example.todoapp.model.projection;

import com.example.todoapp.model.Task;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class GroupTaskWriteModel {
    private String description;
    private LocalDateTime deadline;

    Task toTask() {
        return new Task(description, deadline);
    }
}
