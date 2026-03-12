package com.demo.coverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    private Calculate c1 = new Calculate();

    @Test
    public void TestAdd(){
        assertEquals(6,c1.add(2,4));
    }

    @Test
    public void TestSubstract1(){
        assertEquals(2,c1.subtract(6,4));
    }

    @Test
    public void TestSubstract(){
        assertEquals(2,c1.subtract(4,6));
    }

    @Test
    public void TestMultiplication(){
        assertEquals(24,c1.multiply(4,6));
    }

    @Test
    public void TestDivide(){
        assertEquals(2,c1.divide(8,4));
    }

    @Test
    public void ThrowArithematicException(){
        assertThrows(ArithmeticException.class,() -> c1.divide(10,0));
    }
}
