package com.company.lesson4;
import  java.util.Scanner;
public class massive13 {
    public static void main(String[] args) {
        String[] currencies = {"USD", "EUR", "JPY", "RUB"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ������, ������� ������ ������:");
        int index = scanner.nextInt(); // ��� ������������ ������ ������ � ��������� ��� ����

        if (index < 0) {
            // ���� ������ ������ 0, �������� ������������ �� ������
            System.out.println("�������� �������� ������ ������! �������� ����� �� 0 �� 3.");
        } else if (index >= currencies.length) {
            // ������ ������ ���� ������ ������ ����� �������
            System.out.println("�������� �������� ������ ������! �������� ����� �� 0 �� 3.");
        } else {
            // �� ������, ������� ����������� ������������� ������
            System.out.println("�� ������ ������: " + currencies[index]);
        }
    }
}
