package com.KFOKAM48.toDoList_Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KFOKAM48.toDoList_Project.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Task.Status status);
}
