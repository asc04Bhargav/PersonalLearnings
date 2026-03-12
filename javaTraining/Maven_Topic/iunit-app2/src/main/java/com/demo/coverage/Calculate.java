package com.demo.coverage;

public class Calculate {

    public int add(int i, int j){
        return i+j;
    }

    public int subtract(int i, int j){
        if (i>j){
            return i-j;
        } else {
            return j-i;
        }
    }

    public int multiply(int i, int j){
        return i*j;
    }

    public int divide(int i,int j){
        if (j==0){
            throw new ArithmeticException("denominator is 0");
        }
        return i /j;
    }


}
