package com.company.java;

import java.util.Scanner;

/**
 * 3. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */
public class task3 {
    public static void main(String[] args) {
        // рубль    1,21,31,41,51,
        // рублей   5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,26,27,28,29,30,35,36)
        // рубля    2,3,4,22,23,24,32,33,34,42,43,44,
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму:");
        int sum = scanner.nextInt();
        if ((sum % 10 == 1) && (sum % 100 != 11)) {
            System.out.println(sum + " рубль");
        } else if ((sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4) && !(sum % 100 == 12 || sum % 100 == 13 || sum % 100 == 14)) {
            System.out.println(sum + " рубля");
        } else {
            System.out.println(sum + " рублей");
        }


    }

}
