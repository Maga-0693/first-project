package JavaCore.Kurs3.Tema3;

import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        double cmInInch = 2.54;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите марку телевизора:");
        String tvBrand = scanner.nextLine();

        System.out.println("Введите размер диагонали в дюймах:");
        double lengthInInch = scanner.nextDouble();
        double lengthInCm = lengthInInch * cmInInch;

        System.out.println("Введите цену и размер скидки в процентах: ");
        double price = scanner.nextDouble();
        int discount = scanner.nextInt();

        double totalPrice = price * (100 - discount) / 100;

        System.out.println("Поздравляем вас с покупкой телевизора фирмы " + tvBrand + "." +
                " Размер диагонали телевизора " + lengthInCm + " сантиметра," +
                " итоговая цена " + totalPrice);
    }
}
/*Усложним задачу. Теперь программа должна вычислять ещё и скидку на новый телевизор —
на основе цены без скидки и суммы скидки в процентах.

Также программа должна уточнять у пользователя марку телевизора, который он выбрал.
Это поможет избежать ошибки: если пользователь сомневается и выбирает между несколькими марками,
вывод напомнит, о каком именно телевизоре идёт речь.*/
