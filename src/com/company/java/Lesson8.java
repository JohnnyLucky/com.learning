package com.company.java;

                       // Массивы

public class Lesson8 {
    public static void main(String[] args) {
        int [] values = new int [10];                      // массив из 10 неизвестных элементов со значением 0
        values [2] = 10;                                   // изменение массива
        values [4] = 18;
        for (int i = 0; i <values.length ; i++) {          // .length длина массива
            System.out.println(i + " :" + values[i]);      // [i] индекс массива
        }

    }

    private static void test() {
        //               0 1 2 3 4 5 индекс массива
        int [] values = {1,4,5,6,7,8};        // проиндексированный массив
        System.out.println(values[1]);        // values [1] обращение к индексу массива
        values[2] = 18;                       // изменение массива
        System.out.println(values[2]);
    }
}
