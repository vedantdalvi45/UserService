package com.ved.user.service.UserService.exceptions;

public class ResourceNotFountException extends RuntimeException{
    public ResourceNotFountException() {
        super("Resource not found on server !!");
    }

    public ResourceNotFountException(String message) {
        super(message);
    }

}
