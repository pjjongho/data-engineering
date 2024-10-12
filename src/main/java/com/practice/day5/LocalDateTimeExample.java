package com.practice.day5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime
                .of(2022,Month.APRIL,20,6,30));

        System.out.println(LocalDateTime
                .parse("2024-10-12T15:29:25.088"));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.plusDays(1));
    }
}
