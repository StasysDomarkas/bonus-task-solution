package com.stasysdomarkas;

import java.time.*;

public class Main {

    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }

    static void printBonusDatesBetween(int fromYear, int toYear){
        LocalDate date = LocalDate.parse(fromYear + "-01" + "-01");
        LocalDate endDate = LocalDate.parse(toYear - 1 + "-12" + "-31");

        while (!date.isAfter(endDate)) {
            String dateString = date.toString().replaceAll("-","");
            StringBuilder dateReversed = new StringBuilder();
            String dateStringReversed = dateReversed.append(dateString).reverse().toString();
            if(dateString.equals(dateStringReversed)){
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
    }
}
