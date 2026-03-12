package com.test.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestJunitDemo {

    @BeforeAll
    public static void initAll(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void cleanAll(){
        System.out.println("After All");
    }

    @BeforeEach
    public void init(){
        System.out.println("Before Each");
    }

    @AfterEach
    public void clean(){
        System.out.println("After Each");
    }

    @Test
    public void testEquals(){
        String s1 = "hello";
        String s2 = "hello";
        assertEquals(s1,s2);
    }

    @Test
    public void testFlag(){
        boolean x = true;
        assertTrue(x);
    }

    @Test
    public void testArrayEquals(){
        int num1[]={1,2,3,4};
        int num2[] ={1,2,3,4};
        assertArrayEquals(num1,num2);
    }
}
