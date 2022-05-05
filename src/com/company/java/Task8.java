package com.company.java;

/**
 * 3. В 1626 году индейцы продали Манхэттен за 24$.
 * Написать программу, которая высчитывает сумму,
 * получившуюся в текущем году, если бы индейцы положили эти
 * деньги в банк под 5% годовых.
 */
public class Task8 {
    public static void main(String[] args) {
        double sourceSum = 24;                        // исходное значение
        double result = sum(sourceSum);              // вызов функции
        System.out.println(result + " общая сумма");

    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2022; year++) {
            double percent = result * 0.05;                  //  вычисление процентов
            result += percent;                               // проценты добавляются к общей сумме вклада
            System.out.println(year + " : " + result);
        }
        return result;
    }
}
