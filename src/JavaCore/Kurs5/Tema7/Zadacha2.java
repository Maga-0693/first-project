package JavaCore.Kurs5.Tema7;

import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        double[] expenses = new double[7];
        double expense = 50;

        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
            System.out.println("Расходы за неделю успешно занесены в приложение!");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Расходы за какой день вы хотите проверить. Выберите значение от 0 (пн) до 6 (вс).");
                int index = scanner.nextInt();

            if (index < 0) {
                System.out.println("Выбрано неверное значение! Минимальное значение - 0");
            } else if (index >= expenses.length) {
                System.out.println("Выбрано неверное значение! Максимальное значение - " + (expenses.length - 1));
            } else {
                System.out.println("Потрачено " + expenses[index] +" рублей");
                break;
            }
        }
    }
}

/*После того как вы нашли и исправили все ошибки, программа по автозаполнению массива с расходами за неделю
работает правильно. Допишите её таким образом, чтобы у пользователя появилась возможность это проверить — вызвать
любой элемент массива по его индексу. Исключите ошибки выхода за границы массива — настройте ответ программы
на тот случай, если пользователь введёт несуществующий индекс. Чтобы можно было ошибаться много раз — мы добавили
в код бесконечный цикл. Прервите его выполнение с помощью оператора break в том случае, если введён корректный индекс.*/
