package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**   BufferedReader */

public class Lesson10 {
    public static void main(String[] args) throws IOException {
        //BufferedReader ���������� � ����� /InputStreamReader ��������� � �����/ System.in ��������� �� �������   <--
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);
        // ���� ����� � �������
        int num = Integer.parseInt(reader.readLine());
        System.out.println(num*2);

    }
}

