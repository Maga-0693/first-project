package JavaCore.Kurs5.Tema8;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        double[] expenses = new double[7];
        double rateUSD = 94.8;
        double rateEUR = 103.8;
        double rateCNY = 13.1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 — Конвертировать валюту");
            System.out.println("2 — Получить совет");
            System.out.println("3 — Вывести трату");
            System.out.println("0 — Выход");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - CNY.");
                int currency = scanner.nextInt();
                if (currency == 1) {
                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Ваши сбережения в юанях: " + moneyBeforeSalary / rateCNY);
                } else {
                    System.out.println("Введена неизвестная валюта.");
                }
            } else if (command == 2) {
                if (moneyBeforeSalary < 3000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 10000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Можно заказать пиццу!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                    }
                } else if (moneyBeforeSalary < 30000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Неплохо! Сегодня можно поужинать в кафе. :)");
                    } else {
                        System.out.println("Можно заказать пиццу!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Отлично! Можно сходить в ресторан.");
                    } else {
                        System.out.println("Неплохо! Сегодня можно поужинать в кафе. :)");
                    }
                }
            } else if (command == 3) {
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int index = scanner.nextInt();
                if (index >= 1 && index <= 7) {
                    System.out.println("Введите размер траты:");
                }
                double expense = scanner.nextDouble();
                int day = index;

                expenses[day - 1] = expense;
                expense = expense + expense;
                System.out.println("Значение сохранено!");

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}

/*Будет здорово, если финансовое приложение научится записывать ваши ежедневные расходы. Для этого нужно
доработать код приложения.
1. В этой теме вы много работали с массивами трат за неделю. Добавьте в приложение пустой массив для учёта
расходов за неделю с именем expenses.
2. Добавьте в цифровое меню приложения новую команду «3 — Ввести трату».
3. Допишите условие ветвления для обработки новой команды.
4. Внутри нового ветвления попросите пользователя выбрать день, за который он хочет внести расходы, а потом
указать их сумму. Запишите траты в массив.
5. Учтите, что если в массиве уже сохранены какие-то расходы за выбранный день, то они должны суммироваться с
новыми. Обратите внимание, что нумерация дней недели и нумерация индексов в массиве отличаются и вам нужно
скорректировать это.*/