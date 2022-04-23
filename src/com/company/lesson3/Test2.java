package com.company.lesson3;

public class Test2 {
    public static void main(String[] args) {
        int weight = 700;
        if (weight < 800) {
            for (int i = 1;i<6;i=i+1)
                System.out.println("Сьесть " + i + " морковок");

        } else {
            System.out.println("Сегодня разгрузочный день!");
        }


        int day = 30;
        int runPerDay = 2;
        for (int i=1;i<=day;i++){
            System.out.println("День " + i);
            for (int j=1; j<=runPerDay;j++){
                System.out.println("Пробежка " + j);
            }
        }
        int flatsNumber = 5; // Количество квартир на этаже
        int floorsNumber = 10; // Количество этажей

        for (int i=1;i<=floorsNumber;i=i+1) {
            for (int j=1; j<=flatsNumber;j=j+1) {
                int currentFlat = (i - 1) * flatsNumber + j; // Заготовка формулы для учёта квартир
                System.out.println("Этаж " + i + " квартира " + currentFlat + " — доставлено.");
            }
        }
    }
}
