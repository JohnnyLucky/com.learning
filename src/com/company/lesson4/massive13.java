package com.company.lesson4;
import  java.util.Scanner;
public class massive13 {
    public static void main(String[] args) {
        String[] currencies = {"USD", "EUR", "JPY", "RUB"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер валюты, которую хотите купить:");
        int index = scanner.nextInt(); // Даём пользователю ввести индекс и считываем его ввод

        if (index < 0) {
            // Если индекс меньше 0, сообщаем пользователю об ошибке
            System.out.println("Неверное значение номера валюты! Выберите число от 0 до 3.");
        } else if (index >= currencies.length) {
            // Индекс должен быть строго меньше длины массива
            System.out.println("Неверное значение номера валюты! Выберите число от 0 до 3.");
        } else {
            // Всё хорошо, выводим запрошенную пользователем валюту
            System.out.println("Вы купили валюту: " + currencies[index]);
        }
    }
}
