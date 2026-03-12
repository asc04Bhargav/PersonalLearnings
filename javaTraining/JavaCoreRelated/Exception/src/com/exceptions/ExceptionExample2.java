package com.exceptions;

public class ExceptionExample2 {
    public static void main(String[] args) {
        String loginUsername ="scott", password = "tiger";

        LoginCheck lc = new LoginCheck();
        try {
            lc.authenticate(loginUsername,password);
        } catch (InvalidUsernameException e) {
//            throw new RuntimeException(e);
            System.out.println("exception occured.." + e);
        }
    }
}
