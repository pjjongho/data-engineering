package com.practice.day4_Quiz2;

public class ArrayCalculation {

    int[] arr = {0,1,2,3,4};

    public int divide(int denominatorIndex, int numeratorIndex)
        throws ArithmeticException, ArrayIndexOutOfBoundsException {
        return arr[denominatorIndex] / arr[numeratorIndex];
    }
}
