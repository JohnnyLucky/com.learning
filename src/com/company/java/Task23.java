package com.company.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ����������� ����� compare(int a). ����� ������ �������� ������ �� ����� "����� ������ 5", ���� �������� ������ ������ 5 - �, �������� ������ "����� ������ 5", ���� ��������
 * ������ ������ 5 - �, � �������� ������ "����� ����� 5", ���� �������� ������ ����� 5 - �.
 */
public class Task23 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("������� �����:");
        int a = Integer.parseInt(reader.readLine());
        System.out.println(compare(a));
    }

    public static int compare(int a) {

        if (a < 5) {
            System.out.println("����� " + " ������ 5.");
        } else if (a == 5) {
            System.out.println("����� " + " ����� 5.");
        } else{
            System.out.println("����� " + " ������ 5.");
        }    return a;

    }
}