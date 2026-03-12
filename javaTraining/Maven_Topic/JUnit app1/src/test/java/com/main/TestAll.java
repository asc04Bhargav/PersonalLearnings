package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAll {
    @Test
    public void testMultipleExample(){
        assertAll(
                ()-> assertEquals(10,5+5),
                ()->assertNull(null),
                ()->assertFalse(false)
        );
    }
}
