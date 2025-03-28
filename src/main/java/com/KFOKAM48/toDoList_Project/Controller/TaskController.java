package com.KFOKAM48.toDoList_Project.Controller;
import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.KFOKAM48.toDoList_Project.Task;
import com.KFOKAM48.toDoList_Project.services.TaskService;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    @Operation(summary = "Create a new task")
    public Task createTask (@RequestBody Task task){

        return taskService.createTask(task);
    }

    @GetMapping("/all")
    @Operation(summary = "Get all tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/status")
    @Operation(summary = "Get tasks by status")
    public List<Task> getTasksByStatus(@RequestParam(required = false) Task.Status status){
        if (status == null) {
            return taskService.getAllTasks();
        }
        return taskService.getTasksByStatus(status);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get task by ID")
    public Optional<Task> getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update task by ID")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task){
        task.setId(id);
        return taskService.updateTask(task);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete task by ID")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
    
    

}