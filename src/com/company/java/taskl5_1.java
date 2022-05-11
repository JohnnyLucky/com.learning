package com.company.java;

/**
 * 1. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
 */
public class taskl5_1 {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 10;
        int result = getMax(value1,value2);      // вызов и присваивание
        System.out.println(result);

    }
    public static int getMax(int value1, int value2){
        if (value1 > value2){
            return value1;
        } else {
            return value2;
        }
    }
}


