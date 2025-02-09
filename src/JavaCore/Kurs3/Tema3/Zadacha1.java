package JavaCore.Kurs3.Tema3;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        double cmInInch = 2.54;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер диагонали в дюймах:");

        double lengthInInch = scanner.nextDouble();
        double lengthInCm = lengthInInch * cmInInch;

        System.out.println("Размер диагонали в сантиметрах: " + lengthInCm);
    }
}
/* Вы хотите заказать телевизор в интернет-магазине. Но есть проблема:
размер диагонали указан в дюймах, а вам хотелось бы оценить размер в привычных сантиметрах.
Ваша задача — реализовать программу, которая запрашивает у пользователя размер в дюймах,
считывает его и отображает результат в сантиметрах. Scanner придёт на помощь!*/