package com.practice.day6;

import java.util.Arrays;
import java.util.List;

public class StramExample4 {
    public static void main(String[] args) {
        List<Integer> numArr = Arrays.asList(1,3,5,7,9,10);
        int result = numArr.stream()
                .reduce(0, StramExample4::sum);
        System.out.println(result);

        String[] arr = {"Data","Engineering","is","so","hard"};
        List<String> strArr = Arrays.asList(arr);
        String result2 = strArr.stream()
                .reduce("Class Overview: ", (prev, next) -> prev+next + " ");
        System.out.println(result2);
    }

    public static int sum(int a, int b){
        System.out.println("a = " + a + ", b = " + b);
        return a+b;
    }
}
