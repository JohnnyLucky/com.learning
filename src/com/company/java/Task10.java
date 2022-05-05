package com.company.java;

/**
 * 5. �������� ���������, ������� �������� ������ �� �����������
 * ��������, ������� � ����� �b�, � ������� ������ ����� �� ��� ���,
 * ���� �� �������� ������� (�.�. ������� ��������� �� �������).
 */
public class Task10 {
    public static void main(String[] args) {
        printLetters();

    }

    public static void printLetters() {
        for (char letter = 'b'; !isVowel(letter); letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'y' || value == 'u' || value == 'i' || value == 'o';
    }
}
