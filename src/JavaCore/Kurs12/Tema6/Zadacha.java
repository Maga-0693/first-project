package JavaCore.Kurs12.Tema6;

import java.util.Scanner;

public class Zadacha {
    public static void main(String[] args) {
        System.out.println("Привет!");

        doCommand();
    }

    public static void doCommand() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Получить совет о покупке евро");
            System.out.println("2 - Получить совет о покупке долларов");
            System.out.println("0 - Выход");
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Если евро стоит меньше 105 рублей - покупайте!");
            } else if (command == 2) {
                System.out.println("Если доллар стоит меньше 95 рублей - покупайте!");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            }
        }
    }
}
/*Перед вами код приложения, которое умеет давать пользователю советы о покупке долларов и евро в зависимости
от их курса. Однако сейчас код не запускается — в нём допущены ошибки. Вам необходимо исправить их. Учтите,
что после выполнения команд с выводом советов программа должна ещё раз запрашивать у пользователя ввод команды.
При выборе команды «Выход» приложение должно завершить работу.*/