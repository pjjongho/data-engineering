package com.practice.day6;

import java.util.Arrays;
import java.util.stream.Stream;

public class SteamExample2 {
    public static void main(String[] args) {
        String[] arr = {"Data","Engineering","is","so","hard"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(param -> System.out.println(param+" ")

        );

        System.out.println();
    }
}
