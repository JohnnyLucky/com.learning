package com.company.java;

/**
 * 1) ������� ����� convert, ������� ������ �������������� ���� � �������. � ����� ������ ��������� ���� �������� (�-�� ����). ����� ������ ���������� �-�� ��������.
 * 2) ������� ����� percent, ������� ��������� ���� �������� (�����) � ���������� ��� �� ����� + 10% �� ����.
 * 3) ������� ����� print, ������� ��������� ���� �������� (������) � ������� ��� ������ 4 ���� � �������.
 */
public class Task17 {
    public static void main(String[] args) {
        double result = convert(100);
        System.out.println(result);
        double result1 = percent(30);
        System.out.println(result1);
        System.out.println(print());
        System.out.println(print());
        System.out.println(print());
        System.out.println(print());
    }

    public static double convert(int sumEuro) {
        double usd = 65.4;
        double eur = 72.3;
        double eurToRub = eur * sumEuro;
        return eurToRub / usd;
    }

    public static double percent(double value) {
        double result = (value * 0.1) + value;
        return result;
    }

    public static String print (){
        return "hello world";

    }
}



