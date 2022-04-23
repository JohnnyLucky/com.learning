package com.company.learning;

import java.util.Scanner;

public class learning6 {
    public static void main(String[] args) {
        double USD = 75.5;
        double EUR = 75.5;
        double JPY = 75.5;
        double CAD = 60.8;

        double value[] = new double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши сбережения:");
        double cash = scanner.nextDouble();
        while (true) {
            System.out.println("Введите команду:");
            System.out.println("1 - конвертация валюты");
            System.out.println("2 - Записать трату за день");
            System.out.println("3 - Траты за неделю");
            System.out.println("0 - Выход");
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Выберите валюту: 1 - USD; 2 - EUR; 3 - JPY; 4 - CAD");
                int currencyType = scanner.nextInt();
                if (currencyType == 1) {
                    System.out.println("Ваши сбережения в долларах " + cash / USD);
                } else if (currencyType == 2) {
                    System.out.println("Ваши сбережения в евро " + cash / EUR);
                } else if (currencyType == 3) {
                    System.out.println("Ваши сбережения в йенах " + cash / JPY);
                } else if (currencyType == 4) {
                    System.out.println("Ваши сбережения в канадских долларах " + cash / CAD);
                }
            } else if (command == 2) {
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double cashPerDay = scanner.nextDouble();
                cash = cash - cashPerDay;
                value[day - 1] = value[day - 1] + cashPerDay;
                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + cash);
            } else if (command == 3) {
                for (int i = 0; i < value.length; i++) {
                    System.out.println("День " + (i + 1) + ". Потрачено " + value[i] + " рублей");

                }
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            }
        }
    }
}