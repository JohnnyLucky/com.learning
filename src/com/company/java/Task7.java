package com.company.java;

import java.util.Scanner;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int value = scanner.nextInt();
        int result = sum(value);
        int result1 = sumFor(value);
        System.out.println(result);
        System.out.println(result1);

    }

// цикл while

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue !=0){                   // Проверяем условие не равно ли число 0
            result = result + currentValue % 10;   //  Остаток от деления, чтобы получить последнюю цифру
            currentValue = currentValue / 10;      // Делим число на 10, чтобы перейти к следующей цифре
        }
        return result;
    }

// цикл for

    public static int sumFor(int value){
        int result1 = 0;
        for (int currentValue = value; currentValue !=0 ; currentValue /=10) {
            result1 += currentValue %10;
                }
        return result1;
    }
}
