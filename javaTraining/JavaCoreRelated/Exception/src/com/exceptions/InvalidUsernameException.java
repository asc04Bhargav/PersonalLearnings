package com.exceptions;

public class InvalidUsernameException extends Exception{
    private String username;


    public InvalidUsernameException(){

    }

    public InvalidUsernameException(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "InvalidUsernameException{" +
                "username='" + username + '\'' +
                '}';
    }
}
