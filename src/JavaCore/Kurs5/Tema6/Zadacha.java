package JavaCore.Kurs5.Tema6;

import java.util.Random;

public class Zadacha {
    public static void main(String[] args) {
        int[] expenses = new int[7];

        Random random = new Random();

        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1000);
        }
        System.out.println("Траты за неделю: ");

        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено рублей: " + expenses[i]);
        }

        int sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum = sum + expenses[i];
        }
        System.out.println("Траты в рублях за неделю: " + sum);
    }
}

/*Заполните массив трат за неделю — expenses, используя цикл for. Расходы за каждый день будут определяться
случайным образом с помощью генератора Random с ограничением в 1000. После заполнения массива напечатайте
значения его элементов и посчитайте сумму трат за неделю — также с помощью циклов.*/