package com.company.java;
/**
 * 1) ������� ����� sum, ������� ������ ����������� 2 �����.
 * 1) ������� ����� multy, ������� ������ �������� 2 �����.
 * 1) ������� ����� subt, ������� ������ ������� ������ ����� �� �������.
 * 1) ������� ����� div, ������� ������ ������ 2 �����.
 */

public class Task16 {
    public static void main(String[] args) {

        int result = sum(20, 30);
        System.out.println(result);
        int multy = multy(10, 20);
        System.out.println(multy);
        int subt = subt(33, 55);
        System.out.println(subt);
        double div = div(33, 55);
        System.out.println(div);
    }

    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int multy(int x, int y) {
        int multy = x * y;
        return multy;
    }

    public static int subt(int x, int y) {
        int subt = y - x;
        return subt;

    }

    public static double div(double x, double y) {
        double div = x / y;
        return div;
    }
}

