package com.practice.day5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(LocalTime.parse("07:30"));

        System.out.println(LocalTime.of(7,30));

        LocalTime nineThirty = LocalTime
                .of(7,30)
                .plus(2, ChronoUnit.HOURS);
        System.out.println(nineThirty);

        System.out.println(LocalTime.of(6,30)
                .isBefore(LocalTime
                        .of(7,30)));


    }
}
