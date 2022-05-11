package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Ввести с клавиатуры три числа, вывести на экран среднее из них.*/

public class Task22 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите третье число:");
        int num3 = Integer.parseInt(reader.readLine());
     //      50     40     50      30
        if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3){
            System.out.println("Среднее из введенных чисел " + num1);
            //     40      50     40     30
        } else if (num2 > num1 && num2 < num3 || num2 < num1 && num1 > num3){
            System.out.println("Среднее из введенных чисел " + num2);
        } else
            System.out.println("Среднее из введенных чисел " + num3);

    }
}
