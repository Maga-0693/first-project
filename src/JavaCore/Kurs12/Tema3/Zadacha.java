package JavaCore.Kurs12.Tema3;

import java.util.Scanner;

public class Zadacha {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeUserByName();
        sayHelloByTime();
        printSuccess();
    }

    public static void welcomeUserByName() {
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime() {
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else if (currentHour < 22) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Доброй ночи!");
        }
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}

/*Вам поручили запрограммировать робота, который должен познакомиться с пользователем, поздороваться с ним
в зависимости от времени суток и поздравить с успехами в программировании. Для этого нужно объявить и
реализовать такие методы:

Метод welcomeUserByName() должен спрашивать у пользователя имя, а потом сообщать, что рад знакомству.
Метод sayHelloByTime() должен спрашивать у пользователя время и в зависимости от ответа печатать приветствие:
с 22 часов вечера и до 6 часов утра не включительно — "Доброй ночи!";
с 6 до 12 не включительно — "Доброе утро!";
с 12 до 18 не включительно — "Добрый день!";
с 18 до 22 не включительно — "Добрый вечер!".

Метод printSuccess() должен печать только одну строку — "У вас уже неплохо получается программировать!".*/