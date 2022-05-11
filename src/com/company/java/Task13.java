package com.company.java;

/** 1. �������� ���������, ������� �������� ������ ������� � ������� �������, ����� � ��������.
 *
 */
public class Task13 {
    public static void main(String[] args) {
        int[]values = {1, 5, 5, 7};
        printArray(values);
        printArrayForeach(values);
        printArrayReverse(values);
    }
    public static void printArrayReverse(int[] values){         // � �������� ������� �������� 1 ����� �� ����� �� ������
        for (int i = values.length -1 ; i  >=0 ; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }


    public static void printArray(int[]values){                // ������ ������ ����� for
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");

        }
        System.out.println();
    }
    public static void printArrayForeach(int[]values){            // foreach
        for (int value : values) {
            System.out.print(value + " ");

        }
        System.out.println();
    }

}
