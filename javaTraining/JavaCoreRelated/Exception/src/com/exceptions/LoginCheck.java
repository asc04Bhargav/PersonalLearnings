package com.exceptions;

public class LoginCheck {
    public  boolean authenticate(String username, String password) throws InvalidUsernameException {
        String dbUsername = "scott", dbPassword = "tiger";

        if (!username.equals(dbUsername) || !password.equals(dbPassword)){
            throw new InvalidUsernameException(username);
        }
        System.out.println("login Successful");
        return true;

    }
}
