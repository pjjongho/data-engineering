package com.practice.day5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(LocalDate.of(2024,10,12));
        System.out.println(LocalDate.parse("2024-10-12"));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);
        LocalDate previousMonthSamDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSamDay);
        DayOfWeek sunday = LocalDate.now().getDayOfWeek();
        System.out.println(sunday);

        int twelve = LocalDate.parse("2024-10-12").getDayOfMonth();
        System.out.println(twelve);

        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(LocalDate.parse("2022-01-01").isLeapYear());

        System.out.println(LocalDate.parse("2024-10-12")
                .isBefore(LocalDate
                        .parse("2024-10-13")));

        LocalDateTime begginingOfDay = LocalDate.parse("2024-10-12").atStartOfDay();
        System.out.println(begginingOfDay);

    }
}
