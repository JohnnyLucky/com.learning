package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры два числа, вывести на экран максимальное из них.
 */

public class Task20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int num2 = Integer.parseInt(reader.readLine());

        if (num1 > num2) {
            System.out.println("Наибольшее число " + num1);
        } else if (num1 < num2) {
            System.out.println("Наибольшее число " + num2);
        } else
            System.out.println("Числа равны.");
    }
}
