package com.company.lesson4;

public class massiv3 {
    public static void main(String[] args) {
        String[] plans = {"Поехать в Китай по работе",
                "Отметить день рождения с друзьями",
                "Обустроить рабочее место",
                "Научиться вести бюджет",
                "Купить диван",
                "Поехать на музыкальный фестиваль",
                "Попросить на работе один удалённый день в неделю",
                "Заняться спортом",
                "Поехать в Японию в отпуск",
                "Начать внедрять zero waste-подходы в повседневную жизнь",
                "Встречаться с друзьями не реже раза в неделю",
                "Перестать есть в кровати"
        };

        // Поменяйте местами покупку дивана и поездку в Китай в три шага, используя swap
        String swap = plans[0]; // Присвойте swap значение элемента, который вы заменяете
        plans[0] = plans[4]; // Присвойте значение одного элемента другому
        plans[4] = swap; // В swap должно оказаться значение элемента, выбранного на замену

        // Замените фразу "Поехать в Японию в отпуск" на "Поехать в Сочи в отпуск"
        plans[8] = "Поехать в Сочи в отпуск";

        System.out.println("Изменения в планах:");
        System.out.println("1. " + plans[0]);
        System.out.println("5. " + plans[4]);
        System.out.println("9. " + plans[8]);

    }
}
 
