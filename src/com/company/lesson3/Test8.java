package com.company.lesson3;
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ���������� ������������-����� �� ����� �� 1 �� 3");

        while (true) { // ��������� ����������� ����
            int x = scanner.nextInt(); // �������� ������ �� ������������

            if (x == 1) { //���� ������������ ������ 1
                System.out.println("������� �� ���� ������. �� ������ �����!"); // ����������
                break; // ������� �� �����
            }
            if (x == 2) { // ���� ������ ����� 2
                System.out.println("������� �� ���� ������. ���� ���� �����!");
                break; // � ������� �� �����
            }
            if (x == 3) { // ���� ������ ����� 3
                System.out.println("������� �� ������� ������! ����, ��� �� ������� ���!");
                break; // � ������� �� �����
            }
            // ������������ ��� �� 1, 2 ��� 3 - ��������� �������
            System.out.println("���� ������ ������ ���� � ��������� �� 1 �� 3");
        }
    }
}
