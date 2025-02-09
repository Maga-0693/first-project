package JavaCore.Kurs6.Tema2;

import java.util.Scanner;

public class Zadacha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько кусков порезана пицца?");
        int slicesInPizza = scanner.nextInt();
        System.out.println("Сколько кусков съедает один участник встречи?");
        int slicesToPerson = scanner.nextInt();
        int numOfPizzas = 2;//всего пиццы
        int totalSlices = numOfPizzas * slicesInPizza;//всего кусков
        int maximumPeopleToMeeting = totalSlices / slicesToPerson;//максимальное количество людей
        int leftSlices = totalSlices % slicesToPerson;//осталось кусков
        System.out.println("Максимальное число участников идеальной встречи: " + maximumPeopleToMeeting);
        System.out.println("Останется кусков пиццы: " + leftSlices);
    }
}

/*По мнению Джеффа Безоса, основателя и главы компании Amazon, идеальная встреча — это встреча, для проведения
которой хватит двух пицц. Помогите Джеффу вычислить, сколько человек можно позвать на встречу, исходя из количества
кусочков пиццы на каждого. Также определите, останется ли ещё пицца после того, как все разойдутся.
Исходные данные узнайте у пользователя: на сколько кусков порезана одна пицца и сколько кусков пиццы съедает
один участник встречи. Вам нужно дополнить реализацию программы с учётом этих данных.*/