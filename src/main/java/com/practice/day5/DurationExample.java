package com.practice.day5;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalTime initialTime = LocalTime.of(6,50,0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
    }
}
