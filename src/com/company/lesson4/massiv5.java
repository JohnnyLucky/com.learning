package com.company.lesson4;
import java.util.Scanner;
public class massiv5 {
    public static void main(String[] args) {
        String[] currencies = {"USD", "EUR", "JPY", "RUB"};
        System.out.println("������ � ����� ��������:");
        System.out.println(currencies[0] + " - ������ 0"); // �������� ������ � �� �������
        System.out.println(currencies[1] + " - ������ 1");
        System.out.println(currencies[2] + " - ������ 2");
        System.out.println(currencies[3] + " - ������ 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ������ ������, ������� ������ ��������:");
        int index = scanner.nextInt(); // ��� ����������� ������ ������ ��������� ������

        System.out.println("�������� ����� ������:");
        String currency = scanner.next(); // ��� ����������� ������ ����� �������� ������

        String previousCurrency = currencies[index]; // ��������� ������ ��������
        currencies[index] = currency; // ����������� ���������� �������� ����� ��������

        System.out.println("�� �������� " + previousCurrency + " ��: " + currencies[index]);

        System.out.println("������ � ����� �������� ����� ������:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);
    }
}

