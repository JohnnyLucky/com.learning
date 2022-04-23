package com.company.lesson2;


import java.util.Scanner;

public class text {
    public static void main(String[] args) {

        double rateUSD = 78.5;
        double rateEUR = 85.3;
        double rateJPY = 0.85;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        System.out.println("Введите команду - Convert или Advice");
        String command = scanner.next();

        if (command.equals("Convert")) {
            System.out.println("В какую валюту будем конвертировать ? Доступные варианты: USD, EUR, JPY.");
            String currency = scanner.next();

            if (currency.equals("USD")) {
                System.out.println("Ваши сбережения в USD: " + moneyBeforeSalary / rateUSD);
            } else if (currency.equals("EUR")) {
                System.out.println("Ваши сбережения в EUR: " + moneyBeforeSalary / rateUSD);
            } else if (currency.equals("JPY")) {
                System.out.println("Ваши сбережения в JPY" + moneyBeforeSalary / rateJPY);
            } else {
                System.out.println("Валюта не поддерживается.");
            }


        } else if (command.equals("Advice")) {
            if (moneyBeforeSalary < 3000) {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            } else if (moneyBeforeSalary < 10000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Окей, пора в Макдак!");
                } else {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                }
            } else if (moneyBeforeSalary < 30000) {
                if (daysBeforeSalary < 10) {
                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                } else {
                    System.out.println("Окей, пора в Макдак!");
                }
            } else {
                if (daysBeforeSalary < 10) {
                    System.out.println("Отлично! Заказывайте крабов!");
                } else {
                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                }
            }
        } else {
            System.out.println("Извините, такой команды пока нет.");
        }
    }
}
