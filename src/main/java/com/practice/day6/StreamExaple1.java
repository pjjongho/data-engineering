package com.practice.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExaple1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("속초");
        list.add("서울");

        System.out.println(list);

        // List 앞의 2개의 element만 제한하여 출력
        List<String> result = list.stream()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println(list);


        // equals, toList => 같은 값이 있는것들을 True로 확인하고 출력
        List<String> result2 = list.stream()
                .filter("서울"::equals)
                .collect(Collectors.toList());

        System.out.println(result2);


        // Set : 같은 값을 가지고있는 element 출력
        Set<String> result3 = list.stream()
                .filter("서울"::equals)
                .collect(Collectors.toSet());

        System.out.println(result3);
    }
}
