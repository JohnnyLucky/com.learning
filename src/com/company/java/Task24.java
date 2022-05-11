package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то увеличить его на 10. Вывести результат на экран.
 */
public class Task24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int value = Integer.parseInt(reader.readLine());
        if (value > 0) {
            value = value * 2;
            System.out.println("Результат операции " + value);
        } else if (value == 0) {
            System.out.println("На ноль умножать нельзя!");
        } else {
            value = value * 10;
            System.out.println("Результат операции " + value);
        }
    }
}


