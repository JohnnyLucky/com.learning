package com.company.java;

                       // �������

public class Lesson8 {
    public static void main(String[] args) {
        int [] values = new int [10];                      // ������ �� 10 ����������� ��������� �� ��������� 0
        values [2] = 10;                                   // ��������� �������
        values [4] = 18;
        for (int i = 0; i <values.length ; i++) {          // .length ����� �������
            System.out.println(i + " :" + values[i]);      // [i] ������ �������
        }

    }

    private static void test() {
        //               0 1 2 3 4 5 ������ �������
        int [] values = {1,4,5,6,7,8};        // ������������������ ������
        System.out.println(values[1]);        // values [1] ��������� � ������� �������
        values[2] = 18;                       // ��������� �������
        System.out.println(values[2]);
    }
}
