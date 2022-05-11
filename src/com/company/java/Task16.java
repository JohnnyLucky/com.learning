package com.company.java;
/**
 * 1) Создать метод sum, который должен суммировать 2 числа.
 * 1) Создать метод multy, который должен умножить 2 числа.
 * 1) Создать метод subt, который должен вычесть второе число из первого.
 * 1) Создать метод div, который должен делить 2 числа.
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

