package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Ввести с клавиатуры число n. * Вывести на экран надпись «Я зарабатываю $n в час». * Пример: * Я буду зарабатывать $50 в час */

public class Task18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());

        System.out.println("Я буду зарабатывать $" + value + " в час");

    }
}
