package JavaCore.Kurs5.Tema3;

public class Zadacha2 {
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

        String swap = plans[0];
        plans[0] = plans [4];
        plans[4] = swap;
        plans[8] = "Поехать в Сочи в отпуск";

        System.out.println("Изменения в планах:");
        System.out.println("1. " + plans[0]);
        System.out.println("5. " + plans[4]);
        System.out.println("9. " + plans[8]);
    }
}

/*Ваш коллега запланировал на год дюжину классных целей и составил из них список в порядке приоритетности.
Однако сразу после новогодних каникул планы изменились. Командировка в Китай отложена на весну, а вот
диван нужен срочно — в гости приедут друзья. Поездка в Японию вообще сорвалась — решено отдыхать в Сочи.

Вам нужно помочь коллеге объявить массив для его планов и внести в него изменения: поменять местами поездку
в Китай и покупку дивана, а цветение сакуры на купание в Чёрном море. Изменения в планах напечатайте,
используя их порядковые номера в списке.*/