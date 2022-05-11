package com.company.java;

/** if else */

public class lesson4 {
    public static void main(String[] args) {
        int value = 10;
        // boolean test = value >= 0;
        if (value > 0) {                                                    // Если
            System.out.println("Число является положительным");
        } else if (value < 0) {                                             // Иначе если
            System.out.println("Число является отрицательным");
        } else {                                                            // Иначе
            System.out.println("Число является нулем");
        }

    }
}

