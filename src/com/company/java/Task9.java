package com.company.java;

import java.util.Scanner;

/**
 * 4. Написать программу, определяющую, является ли введённое
 * целое число простым, т.е. делится без остатка только на 1 и само
 * на себя.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int value = scanner.nextInt();
        boolean result = isSimple(value);
        System.out.println(result);
    }

    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}
