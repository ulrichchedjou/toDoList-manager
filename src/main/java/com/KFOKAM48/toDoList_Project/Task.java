package com.KFOKAM48.toDoList_Project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @NonNull
    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        TODO, IN_PROGRESS, DONE
    }
}