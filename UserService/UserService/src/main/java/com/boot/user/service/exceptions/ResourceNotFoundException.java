package com.boot.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
     super("ResourceNotFoundException");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
