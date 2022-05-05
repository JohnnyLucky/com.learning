package com.company.java;

import java.util.Scanner;

/**
 * 1. Написать программу высчитывающую факториал введённого целого числа.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int value = scanner.nextInt();
        System.out.println("факториал числа " + value + " равен " + calculateFactorial(value));
    }

    public static int calculateFactorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
     // цикл  while
    //    public static int factorialWhile(int value) {
    //    int result = 1;
    //    int i = 1;
    //    while (i <= value) {
    //        result *= i;
    //        i++;
    //    }

    //    return result;
    //  }

}





