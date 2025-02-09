package JavaCore.Kurs4.Tema4;

import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // сумма
        int input = -1; // ввод пользователя

        while (input != 0) {
            input = scanner.nextInt();
            sum = sum + input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}

/*Бесконечный цикл  while (true) с прерыванием break применяется для решения достаточно ограниченного
спектра задач. Чаще всего его удобнее заменить на цикл while с условием. Потренируйтесь это делать.
Эта программа с помощью бесконечного цикла суммирует числа, которые вводит пользователь. Она работает
до тех пор, пока не будет введён 0. Перепишите её, заменив бесконечный цикл на цикл while с условием.*/
