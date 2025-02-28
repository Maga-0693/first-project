package JavaCore.Kurs5.Tema8;

import java.util.Scanner;

public class Zadacha2 {
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
            System.out.println("3 — Ввести трату");
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
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();

                moneyBeforeSalary -= expense;
                expenses[day - 1] = expenses[day - 1] + expense;

                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);

                if (moneyBeforeSalary < 1000) {
                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
                }

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}

/*Доработайте код приложения. При внесении новой траты баланс на счёте должен уменьшаться на эту же сумму.
Для этого внесите изменения в ветвление третьей команды. После того как пользователь ввёл свои расходы за
определённый день, вычтите их значение из общей суммы сбережений и только потом занесите его в массив. В
случае, когда значение баланса опустится ниже 1000 рублей, должно появляться предупреждение: «На вашем
счету осталось совсем немного. Стоит начать экономить!»*/