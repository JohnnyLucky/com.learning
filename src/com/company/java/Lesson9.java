package com.company.java;

// ����������� �������

public class Lesson9 {
    public static void main(String[] args) {
        int [][] values = new int[3][];                            // ������ �� 3 ����������� ��������� ������� ��������� �� ��������� 0
        values[0] = new int[5];                                    // �������� ����������� ������� � �����������, ������� 5
        values[1] = new int[2];                                    // �������� ����������� ������� � �����������, ������� 2
        values[2] = new int[1];
        printArray(values);

    }

    private static void test() {
        int [][] values = {                                        // ������������������ ������
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

    }

    private static void printArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {                  // ������� ���� ������� �� �������
            int [] ints = values[i];
            for (int j = 0; j < ints.length; j++) {                // ����� �� ��������
                System.out.print(ints[j] + " ");


            }
            System.out.println();
        }
    }
}
