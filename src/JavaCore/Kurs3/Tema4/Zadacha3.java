package JavaCore.Kurs3.Tema4;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        double rateUSD = 94.8;
        double rateEUR = 103.8;
        double rateCNY = 13.1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        System.out.println("Введите команду. Доступные команды: convert и advice.");
        String command = scanner.next();

        if (command.equals("convert")) {
            System.out.println("В какую валюту хотите конвертировать рубли? Доступные варианты: USD, EUR, CNY.");

            String currency = scanner.next();

            if (currency.equals("USD")) {
                System.out.println("Ваши сбережения в долларах: " + (moneyBeforeSalary / rateUSD));
            } else if (currency.equals("EUR")) {
                System.out.println("Ваши сбережения в евро: " + (moneyBeforeSalary / rateEUR));
            } else if (currency.equals("CNY")) {
                System.out.println("Ваши сбережения в юанях: " + (moneyBeforeSalary / rateCNY));
            } else {
                System.out.println("Введена неизвестная валюта.");
            }
        } else if (command.equals("advice")) {
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
                    System.out.println("Неплохо! Сегодня можно поужинать в кафе.");
                } else {
                    System.out.println("Можно заказать пиццу!");
                }
            } else {
                if (daysBeforeSalary < 10) {
                    System.out.println("Отлично! Можно сходить в ресторан.");
                } else {
                    System.out.println("Неплохо! Сегодня можно поужинать в кафе.");
                }
            }
        } else {
            System.out.println("Извините, такой команды пока нет.");
        }
    }
}
/*Теперь можно объединить код конвертера валют и финансового советника в одно
приложение. В программе будут две команды: convert  (англ. «конвертировать») и advice
(англ. «совет»). Пользователь приложения сможет ввести команду и дополнительные
параметры (сумму на счёте и количество дней до зарплаты), а в ответ получит результат
конвертации или совет относительно ужина.
Какие условия необходимо учесть:
-Если пользователь ошибётся и введёт команду, которая не предусмотрена, то должно
появиться сообщение: «Извините, такой команды пока нет.».
-Если выбрана команда convert, пользователь, помимо количества средств на счёте,
вводит код валюты — USD, EUR или CNY. В зависимости от кода происходит
конвертация в доллары, евро или юани соответственно.
-Если пользователь ошибётся и введёт некорректный код валюты, должно появиться
сообщение: «Введена неизвестная валюта.».*/
