package com.practice.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("korea", "Japan", "China", "England"));
        Stream<String> stream = stringList.stream();
        stream.map((str) -> str.toUpperCase()).forEach(System.out::println);
        stringList.forEach((string) ->
                System.out.println(string)

        );
    }
}

