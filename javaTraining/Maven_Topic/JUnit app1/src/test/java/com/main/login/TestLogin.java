package com.main.login;

import com.junit.login.LoginService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLogin {
    LoginService service;

    @BeforeEach
    public void init(){
        service = new LoginService();
    }

    @AfterEach
    public void cleanUp(){
        service = null;
    }

    @Test
    public void testAuthenticateValidInput(){
        boolean res = service.authenticate("test","test");
        assertTrue(res);
    }

    @Test
    public void testAuthenticateInValidInput(){
        boolean res = service.authenticate("Test","test");
        assertFalse(res);
    }

    @Test
    public void testAuthenticateThrowIllegalUserEmpty(){
        assertThrows(IllegalArgumentException.class,() -> service.authenticate("test",""));
    }

    @Test
    public void testAuthenticateThrowIllegalPwdEmpty(){
        assertThrows(IllegalArgumentException.class,() -> service.authenticate("","test"));
    }

    @Test
    public void testAuthenticateThrowIllegalUserPwdEmpty(){
        assertThrows(IllegalArgumentException.class,() -> service.authenticate("",""));
    }

    @Test
    public void testAuthenticateThrowIllegalPwdNull(){
        assertThrows(IllegalArgumentException.class,()-> service.authenticate("test",null));
    }

    @Test
    public void testAuthenticateThrowIllegalUserNull(){
        assertThrows(IllegalArgumentException.class,() -> service.authenticate(null,"test"));
    }

    @Test
    public void testAuthenticateThrowIllegalUserPwdNull(){
        assertThrows(IllegalArgumentException.class,()-> service.authenticate(null,null));
    }

}
