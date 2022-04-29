package com.company.java;

import java.util.Scanner;

/**
 * 4. Написать программу, которая считывает год, введённый пользователем, и определяет,
 * является ли этот год високосным.
 * Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
 * то этот год не високосный, за исключением годов, делящихся на 400.
 * Например:
 * 1992 - високосный
 * 1900 - не високосный
 * 2000 – високосный
 */

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int ears = scanner.nextInt();
        if (ears % 400 == 0 || (ears % 4 == 0 && ears % 100 != 0)){
            System.out.println(ears + " Високосный");
        } else {
            System.out.println(ears + " Не високосный");
        }

    }
}
