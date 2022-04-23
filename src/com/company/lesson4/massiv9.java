package com.company.lesson4;

public class massiv9 {
    public static void main(String[] args) {
        // Создайте и заполните массив именами участников сделки
        String [] participants = {"Петра","Надежды ","Валентина"};
        // Создайте и заполните массив документов участников сделки (с заглавной буквы)
        String [] documents = {"Паспорт","Водительское удостоверение","Свидетельство о рождении"};

        // Проверьте количество документов, оно должно быть равно числу участников
        if (participants.length == documents.length) {
            System.out.println("Документы загружены верно. Список документов:");
            // Если условие верно, напечатайте список документов в формате: "Пётр: Паспорт"
            System.out.println(participants[0] + ": " + documents[0]);
            System.out.println(participants[1] + ": " + documents[1]);
            System.out.println(participants[2] + ": " + documents[2]);

        } else {
            /* Для ошибки предусмотрите печать такого сообщения:
						 "Количество документов не соответствует количеству участников сделки." */
            System.out.println("Количество документов не соответствует количеству участников сделки.");
        }
    }
}

