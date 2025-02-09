package JavaCore.Kurs12.Tema4;

import java.util.Scanner;

public class Zadacha {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        sayHello();
        sayHelloByTime();
        welcomeUserByName();
        printSuccess();
    }

    public static void welcomeUserByName() {
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        printCity();
        String city = scanner.next();
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }

    public static void sayHello() {
        System.out.println ("Привет!");
    }

    public static void printCity() {
        System.out.println ("Из какого вы города?");
    }

    public static void sayHelloByTime() {
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour > 22) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
/*Ваш робот уже умеет знакомиться, здороваться в зависимости от времени суток и хвалить за успехи в программировании.
Теперь научите его начинать общение с короткого приветствия и спрашивать у пользователя, из какого он города.
Сделайте это с помощью методов sayHello() и printCity(). Результат должен получиться таким:
Привет!
Который час?
> ввод текущего часа
Добрый день! (один из вариантов)
Как вас зовут?
> ввод имени
Из какого вы города?
> ввод города
Рад познакомиться, <ваше имя> из <вашего города>!
У вас уже неплохо получается программировать!*/