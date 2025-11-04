package com.ved.user.service.UserService.exceptions;

public class DuplicateEntryException extends RuntimeException{
    public DuplicateEntryException() {
        super("Duplicate entry found !!");
    }

    public DuplicateEntryException(String message) {
        super(message);
    }

}
