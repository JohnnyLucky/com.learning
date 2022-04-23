package com.company.lesson3;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // Позволяет считать ответ пользователя
        int x = 0; // Хранит ответ пользователя

        while (x != 5)  { // Цикл выполняется, пока х не равна 5
            System.out.println("Сколько будет 2 + 3 ?");
            x = scanner.nextInt(); // Считываем из консоли число и присваиваем переменной х


        }
        System.out.println("Пример решен правильно !");
    }
}
