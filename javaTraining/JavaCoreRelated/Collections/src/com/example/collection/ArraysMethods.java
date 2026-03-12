package com.example.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysMethods {
    public static void main(String[] args) {

//    this class has various methods to manipulate arrays.
        Integer arr[]={11,23,123,12,13,124};

//    Arrays.asList()
        List<Integer> arr1 = Arrays.asList(arr);
        System.out.println(arr1);

//        Arrays.sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
