package com.company.learning;

import java.util.Scanner;
import java.util.Random;

public class learning1 {
    public static void main(String[] args) {
        double value[] = new double[10];
        double USD = 78.5;
        double EUR = 88.5;
        double JPY = 0.85;
        double CNY = 12.5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму:");
        double sumCash = scanner.nextDouble();

        while (true) {



            System.out.println("Выберите валюту: 1 - USD, 2 - EUR; 3 - JPY; 4 - CNY");
            int walue = scanner.nextInt();
            if (walue == 1) {
                System.out.println("Ваши сбережения в USD: " + sumCash / USD);
            } else if (walue == 2) {
                System.out.println("Ваши сбережения в EUR: " + sumCash / EUR);
            } else if (walue == 3) {
                System.out.println("Ваши сбережения в JPY: " + sumCash / JPY);
            } else if (walue == 4) {
                System.out.println("Ваши сбережения в CNY: " + sumCash / CNY);
            } else {
                System.out.println("Валюта не поддерживается!");
            }



        }
    }
}