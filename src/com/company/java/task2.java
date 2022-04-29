package com.company.java;

// Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.

public class task2 {
    public static void main(String[] args) {
        int a = 31;
        int b = a % 10;
        if (b % 10 == 3) {
            System.out.println("Число равно 3");
        } else {
            System.out.println("Число не равно 3");
        }
    }
}
