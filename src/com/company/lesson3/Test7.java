package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // // Генерирует новое число от 0 до 1000

        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");
        while (userInput != randomInt) {   // Условие цикла для запуска игры

            userInput = scanner.nextInt(); // Условие проверяется в цикле
            if (userInput > randomInt)     // Если мельше
                System.out.println("Меньше");
            else                           // Если больше
                System.out.println("Больше");


        }
        System.out.println("Вы великолепны! Именно это я загадал.");

    }
}
