package com.company.test;

import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        int myArray[] = new int[7];

        double USD = 78.5;
        double EUR = 88.5;
        double JPY = 0.85;
        double DYN = 178.5;

        Scanner scaner = new Scanner(System.in);
        System.out.println("Сколько денег?");
        double moneyBefore = scaner.nextDouble();


        System.out.println("Дней до зарплаты?");
        int dayBefore = scaner.nextInt();


        System.out.println("Введите команду: 1. Конвертация варюты.");
        System.out.println("Введите команду: 2. Получить совет");
        System.out.println("Введите команду: 3. Ввести трату");
        System.out.println("Введите команду: 4. Всего потрачено за неделю");
        System.out.println("Введите команду: 0. Выход из команды");

        int commandConvert = scaner.nextInt();

        while (true) {
            if (commandConvert == 1) {
                System.out.println("Выберите валюту: 1 - USD, 2 - EUR, 3 - JPY, 4 - DYN ");
                int converValue = scaner.nextInt();
                if (converValue == 1) {
                    System.out.println("Ваши сбережения в USD " + moneyBefore / USD);
                }
                if (converValue == 2) {
                    System.out.println("Ваши сбережения в EUR " + moneyBefore / EUR);
                }
                if (converValue == 3) {
                    System.out.println("Ваши сбережения в JPY " + moneyBefore / JPY);
                }
                if (converValue == 4) {
                    System.out.println("Ваши сбережения в DYN " + moneyBefore / DYN);
                }
            } else if (commandConvert == 2) {
                if (moneyBefore < 3000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBefore < 10000) {
                    if (dayBefore < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                    }
                } else if (moneyBefore < 30000) {
                    if (dayBefore < 10) {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    } else {
                        System.out.println("Окей, пора в Макдак!");
                    }
                } else {
                    if (dayBefore < 10) {
                        System.out.println("Отлично! Заказывайте крабов!");
                    } else {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    }
                }
            } else if (commandConvert == 3) {
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scaner.nextInt();
                System.out.println("Введите трату");
                double array = scaner.nextDouble();
                moneyBefore = moneyBefore - array;
                for (double i = myArray[day - 1]; i < myArray.length; i = myArray[day - 1] + array) ;
            } else if (commandConvert == 4) {

                for (int i = 0; i < myArray.length; i = i + 1) {
                    // Используйте цикл for, чтобы получить все траты — элементы массива expenses
                    // Напечатайте в цикле строку: "День _. Потрачено _ рублей.".

                    // sum = sum + expenses[i];
                    System.out.println("День " + (i + 1) + ". Потрачено " + myArray[i] + " рублей.");
                }
            } else if (commandConvert == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}
