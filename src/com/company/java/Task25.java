package com.company.java;

/**
 * Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить
 * результат на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода.
 */
public class Task25 {
    public static void main(String[] args) {
        checkInterval(28);

    }

    public static void checkInterval(int value) {
        if ((value >= 20) && (value <= 50)) {
            System.out.println("Число " + value + " содержится в интервале.");
        } else
            System.out.println("Число " + value + " не содержится в интервале.");
    }
}



