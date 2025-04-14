package com.KFOKAM48.toDoList_Project.dto;

import com.KFOKAM48.toDoList_Project.Task;

public class CreateTaskRequest {
    private String title;
    private String description;
    private Task.Status status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task.Status getStatus() {
        return status;
    }

    public void setStatus(Task.Status status) {
        this.status = status;
    }
}