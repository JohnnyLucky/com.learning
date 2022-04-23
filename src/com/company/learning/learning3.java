package com.company.learning;

public class learning3 {
    public static void main(String[] args) {
        int value1 = 15;
        int value2 = 10;
        int result = getMax(value1, value2);
        System.out.println(result);
       
    }

    public static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        }
        return secondValue;
    }

}

