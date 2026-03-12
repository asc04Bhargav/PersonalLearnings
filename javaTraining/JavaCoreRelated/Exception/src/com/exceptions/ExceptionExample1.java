package com.exceptions;

public class ExceptionExample1 {

    public static void main(String[] args) {
//        divideByZero();
//        nullException();
//        arrayIndex();
        throwDemo();
    }

    public static void nullException(){
        try {
            String s1= null;
            int len = s1.length();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void throwDemo(){
        throw new NullPointerException("I am thrown purposely");
    }

    public static void arrayIndex(){
        try{
            int arr[]={12,13,14};
            System.out.println(arr[4]);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }

        finally {
            System.out.println("This is in finally block");
        }
        System.out.println("This is outside finally");
    }

    public static void divideByZero(){
        try{
            System.out.println("Hello world");
            int x = 10/ 0;
            System.out.println("Good Morning");
        }
        catch (ArithmeticException e){
            System.out.println("Exception catch here "+ e.getMessage());
        }

    }
}
