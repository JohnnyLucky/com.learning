package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  Ввести с клавиатуры три числа, вывести на экран минимальное из них.*/
public class Task21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите третье число:");
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 > num2 && num1 > num3) {
            System.out.println("Наибольшее число " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Наибольшее число " + num2);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println("Наибольшее число " + num3);
        } else if (num1 == num2 & num1 == num3 ){
            System.out.println("Числа равны");
        }
    }
}
