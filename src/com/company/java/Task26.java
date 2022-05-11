package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.abs;

/** Реализовать метод closeToFive. Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6.
 Если оба числа на равной длине к 5, то вывести на экран любое из них.*/

public class Task26 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        int value1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int value2 = Integer.parseInt(reader.readLine());
        closeToFive(value1, value2);

    }

    public static void closeToFive(int value1, int value2) {
        if ((abs(value1 - 5) < abs(value2 - 5)))
            System.out.println("Ближайшее к 5 число: " + value1);
        else
            System.out.println("Ближайшее к 5 число: " + value2);
    }
}
