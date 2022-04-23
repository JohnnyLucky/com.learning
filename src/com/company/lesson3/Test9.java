package com.company.lesson3;
import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input =1; // Ввод пользователя

        while (input != 0) {
            input = scanner.nextInt();

            if (input == 0) {
                break;
            }
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}
