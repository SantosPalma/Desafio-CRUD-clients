package com.estudo.desafio.service.exception;

public class ResourceConflictException extends RuntimeException {
    public ResourceConflictException(String msg) {
        super(msg);
    }
}
