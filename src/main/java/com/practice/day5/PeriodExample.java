package com.practice.day5;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.of(2024,7,10);
        LocalDate finalDate = initialDate.plus(Period.ofDays(30));
        System.out.println(Period.between(initialDate, finalDate).getDays());
    }
}
