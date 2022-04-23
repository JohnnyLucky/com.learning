package com.company.lesson1;

import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        double x = 75.8;
        double y = 85.7;
        double e = 0.75;
        double z = 30000;


        String sum = "JPY";
        System.out.println("Вы конвертируете рубли в: " + sum);
        if (sum.equals("USD")) {                                        //Если
            System.out.println("Ваши сбережения в USD: " + z / x);
        } else if (sum.equals("EUR")) {                                //Иначе,если
            System.out.println("Ваши сбережения в EUR: " + z / y);
        } else if (sum.equals("JPY")) {                                //Иначе,если
            System.out.println("Ваши сбережения в JPY: " + z / e);
        } else {                                                       //Иначе
            System.out.println("Данная валюта не поддерживается !");
        }

        Scanner scanner = new Scanner(System.in); // Объявили переменную с типом Scanner
        String command = scanner.nextLine(); // Считали строку из консоли
        System.out.println("Введите имя: ");
    }
}

