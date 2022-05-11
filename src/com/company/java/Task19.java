package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
Пример: Alex будет получать 4000 через 5 лет.*/

public class Task19 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();                        // Принимает из консоли строки
        int value = Integer.parseInt(reader.readLine());        // Принимает из консоли числа
        int value1 = Integer.parseInt(reader.readLine());

        System.out.println(name + " будет получать " + value + " через " + value1 + " года." );


    }
}
