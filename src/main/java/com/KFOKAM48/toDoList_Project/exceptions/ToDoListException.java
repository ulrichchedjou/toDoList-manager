package com.KFOKAM48.toDoList_Project.exceptions;

public class ToDoListException extends Exception {

    public ToDoListException() {
        super();
    }

    public ToDoListException(String message) {
        super(message);
    }

    public ToDoListException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToDoListException(Throwable cause) {
        super(cause);
    }
}
