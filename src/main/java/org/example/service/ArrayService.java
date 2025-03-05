package org.example.service;

public class ArrayService {
    public int calculatorSumOfArray(int[] arr){
        if(arr.length==0){
            throw new RuntimeException("Array is empty");
        }
        int total=0;
        for (int num: arr){

            if(num>100 || num<1){
                throw new IllegalArgumentException("Data input is invalid");
            }
            total += num;
        }
        return total;
    }
}
