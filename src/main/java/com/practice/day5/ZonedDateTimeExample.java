package com.practice.day5;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(zoneId);

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);

        System.out.println(ZonedDateTime
                .parse("2024-10-12T15:45:19.134+09:00[Asia/Seoul]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offsetDateTime);
    }
}
