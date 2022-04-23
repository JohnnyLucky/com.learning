package com.company.lesson3;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько у вас денег: ");
        double balance = scanner.nextDouble(); // Ваши сбережения
        int years =0;
        while (balance <1000000){
            balance = balance + balance * 0.05;
            years = years +1;
        }
        System.out.println("Вам понадобится " + years + " лет!");


    }
}
