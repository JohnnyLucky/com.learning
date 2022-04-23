package com.company.lesson3;

public class test {
    public static void main(String[] args) {
        int carrotCount = 0;  // Переменная для подсчёта общего количества морковок
        int carrotPerDay = 3;  // Ежедневный рацион теперь три морковки
        int carrotReserve = 23; // Новая переменная! она отражает, что у вас уже есть 23 морковки

        for (int i = 1; i <= 31; i++) {
            carrotCount = carrotCount + carrotPerDay;
        }
        System.out.println("Нужно докупить морковки:" + (carrotCount - carrotReserve));

        System.out.println("Это первый этаж дома, который построил Джек.");
        for (int e = 2; e <= 10; e++)
            System.out.println("А это " + e + " этаж, он на один выше, чем этаж " + (e - 1));


        int beforeStart = 70;
        for (int i = beforeStart; i >= 0; i = i - 7)
            System.out.println("До старта SpaseY осталось: " + i);

        int days = 5;
        int moneyPerDays = 200;
        int sum = 0;

        for (int i = 1; i <= days; i = i + 1) {
            sum = sum + moneyPerDays;
            System.out.println("День " + i + " Уже " + sum + " руб.");
        }

        int days1 = 0;
        for (int i = 500; (i - 100) >= 0; i = i - 100) {
            days1 = days1 + 3;
            System.out.println("На " + days1 + " - й день останется " + (i - 100) + " рублей.");
        }
        System.out.println("Денег хватит на " + days1 + " дней.");
    }
}

