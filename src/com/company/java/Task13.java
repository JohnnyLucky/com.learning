package com.company.java;

/** 1. Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 *
 */
public class Task13 {
    public static void main(String[] args) {
        int[]values = {1, 5, 5, 7};
        printArray(values);
        printArrayForeach(values);
        printArrayReverse(values);
    }
    public static void printArrayReverse(int[] values){         // в обратном порядке отнимаем 1 чтобы не выйти за массив
        for (int i = values.length -1 ; i  >=0 ; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }


    public static void printArray(int[]values){                // первый способ через for
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
