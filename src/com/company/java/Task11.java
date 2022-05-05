package com.company.java;

import java.util.Scanner;

/**
 * �������� ���������, ����������� � ������������ ��� �����
 * ��������� ������ ��������� ������������� ������ �����.
 *     ������ ����� ���������: � ������� ����� � � �������
 * ��������.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input threshold: ");
        int threshold = scanner.nextInt();

        printFibonacciRecursion(threshold);
    }

    public static void printFibonacci(int threshold) {
        int first = 0;
        int second = 1;
        while (second < threshold) {
            System.out.println(second);
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void printFibonacciRecursion(int threshold) {
        int first = 0;
        int second = 1;
        fibonacci(first, second, threshold);
    }

    public static void fibonacci(int first, int second, int threshold) {
        if (second < threshold) {
            System.out.println(second);
            fibonacci(second, first + second, threshold);
        }
    }
}

