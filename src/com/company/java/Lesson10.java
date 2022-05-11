package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**   BufferedReader */

public class Lesson10 {
    public static void main(String[] args) throws IOException {
        //BufferedReader складываем в буфер /InputStreamReader переводим в байты/ System.in считываем из консоли   <--
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);
        // ¬вод чисел с консоли
        int num = Integer.parseInt(reader.readLine());
        System.out.println(num*2);

    }
}

