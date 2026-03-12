package com.main;

import com.junit.app1.CheckEven;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestCheckEven {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8})
    public void TestEven(int num){
        assertTrue(CheckEven.even(num));
    }
}
