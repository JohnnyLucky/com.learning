package com.company.lesson3;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {


        Random random = new Random(); // Генерирует случайное число
        int dayCount = 0; // Для учёта дней накоплений
        int moneyTotal = 0; // Суммарное количество накоплений
        int moneyToday; // Сколько откладываем сегодня
        int goal = 5000; // Финансовая цель

        while (moneyTotal <= goal) {
            moneyToday = random.nextInt(500); // Случайная сумма на сегодня
            moneyTotal = moneyTotal + moneyToday; // Добавили эти деньги в копилку
            dayCount = dayCount + 1; // Засчитали день

        }
        System.out.println("Ура! Вы смогли накопить " + goal + " за " + dayCount + " дней.");
    }
}
