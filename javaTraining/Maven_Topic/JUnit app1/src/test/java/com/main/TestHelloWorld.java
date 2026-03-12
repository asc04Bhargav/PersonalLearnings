package com.main;

import com.junit.app1.HelloWorld;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestHelloWorld {
    HelloWorld hw = null;

    @BeforeEach
    public void init(){
        hw=new HelloWorld();
    }

    @AfterEach
    public void cleanUp(){
        hw=null;
    }

    @Test
    public void testGreetThrowsIllegal(){
        assertThrows(IllegalArgumentException.class,
                () -> hw.greet(""));
    }

    @Test
    public void testGreet(){
        String result = hw.greet("Scott");
        assertEquals("Hello: Scott",result);
    }

    @Test
    public void testSum(){
        Integer res = hw.sum(10,5);
        assertEquals(15,res);
    }
}
