package com.company.java;

/**
 * ���� for
 */

public class Lesson7 {
    public static void main(String[] args) {
        for (int value= 10; value > 0; value--) {
            System.out.println(value );
            if (value == 5) {
                continue;                                   // ���������� ��������� ������� ��� ���������� �������
                // break;                                   // ��� ���������� ������� ������� �� �����
            }

        }
    }

    private static void foreExaample() {
        for (int value = 10; value > 0; value--) {
            System.out.println(value);
        }
    }
}
