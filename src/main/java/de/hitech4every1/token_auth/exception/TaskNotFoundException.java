package de.hitech4every1.token_auth.exception;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(Long id) {
        super("Could not find task with id " + id);
    }

}
