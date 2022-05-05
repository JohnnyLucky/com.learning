package com.company.java;

import java.util.Scanner;
                                 // Функции


public class lesson5 {
    // модификаторы. возвр. тип название. ([параметры])
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        isLeapYear(year);             // вызов функции

    }
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        // if (result) {
        //    return true;
        // } else {
        //    return false;
       //  }
    }
}
