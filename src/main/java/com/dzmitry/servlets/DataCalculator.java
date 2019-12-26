package com.dzmitry.servlets;

import java.time.LocalDateTime;

public class DataCalculator {

    public LocalDateTime addDaysToCurrentDate(int days) {
        LocalDateTime localDateTime = getCurrentDate();
        return localDateTime.plusDays(days);
    }

    LocalDateTime getCurrentDate() {
        return LocalDateTime.now();
    }

}
