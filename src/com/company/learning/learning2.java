package com.company.learning;

public class learning2 {
    public static void main(String[] args) {
        int year = 2022;
        /* if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " високосный");
        } else
            System.out.println(year + " не високосный");*/
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        return  year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

