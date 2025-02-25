package com.sezeme.section05.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application4 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2020, 11, 11);
        LocalDateTime future = LocalDateTime.of(2026, 12, 25, 12, 0, 0);
        ZonedDateTime now = ZonedDateTime.now();

        System.out.println(past + " 가 " + localDate + " 보다 과거인가 : " + localDate.isAfter(past));
        System.out.println(future + " 가 " + localDate + " 보다 미래인가 : " + localDateTime.isBefore(future));
        System.out.println(zonedDateTime + " 와 " + now + " 가 같은 날인가 : " + zonedDateTime.isEqual(now));
    }
}