package JavaCore.Kurs7.Tema2;

import java.util.Scanner;

public class Zadacha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (!(monthNumber > 12)) {
                break;
            } else {
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
            }
        }
        String season = "12";

        if (monthNumber == 1 || monthNumber == 2) {
            season = "Зима";
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            season = "Весна";
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            season = "Лето";
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            season = "Осень";
        } else {
            season = "Зима";
        }
        if (season.equals("Лето")) {
            System.out.println("Летом лучше остаться в Москве.");

        } else {
            System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
            int ticketMoscowParis = scanner.nextInt();
            System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
            int ticketMoscowLondonParis = scanner.nextInt();
            System.out.println("У вас есть британская виза?");
            System.out.println("1 - да, виза есть");
            System.out.println("0 - визы нет");
            int britainVisa = scanner.nextInt();

            if (ticketMoscowLondonParis < ticketMoscowParis) {
                if (britainVisa == 1) {
                    System.out.println("Летим через Лондон!");
                } else {
                    System.out.println("Летим напрямую в Париж!");
                }
            } else {
                System.out.println("Летим напрямую в Париж!");
            }
        }
    }
}

/*Агрегатор авиабилетов заказал разработку приложения для планирования путешествий.
Доработайте фрагмент кода, отвечающий за маршрут Москва-Париж. В коде допущен ряд ошибок:
где-то неправильно указано условие, где-то некорректно использовано отрицание. Исправьте ошибки так,
чтобы приложение работало корректно в соответствии с техническим заданием.

ТЗ от заказчика:
-Если вводится летний месяц — рекомендуем остаться в Москве.
-Если прямые билеты в Париж дешевле билетов с пересадкой в Лондоне, то советуем лететь напрямую.
-Если билеты с пересадкой в Лондоне дешевле или равны по стоимости прямым билетам в Париж и у
путешественника есть британская виза, то рекомендуем лететь через Лондон.*/