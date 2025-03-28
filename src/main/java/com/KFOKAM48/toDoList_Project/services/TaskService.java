package com.KFOKAM48.toDoList_Project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.KFOKAM48.toDoList_Project.Task;
import com.KFOKAM48.toDoList_Project.repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public List<Task> getTasksByStatus(Task.Status status){
        return taskRepository.findByStatus(status);
    }

    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);
    }

    public Task updateTask(Task task){
        return taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
