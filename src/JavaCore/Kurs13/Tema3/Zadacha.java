package JavaCore.Kurs13.Tema3;

public class Zadacha {
    public static void main(String[] args) {

        String catName = "Пиксель";
        String hamsterName = "Байт";

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        sayHello(catName);
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal(catName);

        sayHello(hamsterName);
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal(hamsterName);
    }

    public static void sayHello(String name) {

        System.out.println("Привет, " + name + "!");
    }

    public static void sayEnjoyMeal(String name) {

        System.out.println("Приятного аппетита, " + name + "!");

    }

    public static double findMaxExpense(double[] expenses) {

        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }

    public static double findExpensesSum(double[] expenses) {

        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum = sum + expenses[i];

        }
        return sum;
    }
}
/*Прочитайте код. Сейчас программа анализирует расходы на корм одновременно для двух питомцев: кота Пикселя
и хомяка Байта. Из-за этого в результатах печати можно запутаться.

Декомпозируйте код — разбейте его на отдельные методы: sayHello, sayEnjoyMeal, findMaxExpense и findExpensesSum.
Также нужно учесть следующие моменты:
- Методы с приветствием и пожеланием приятного аппетита должны быть типа void. Методы, касающиеся анализа трат,
должны возвращать значение.
- У всех методов должны быть параметры. Внутри главного метода main(String[] args) должны остаться массивы с тратами,
вызов методов и вывод результатов трат.
- Вызовите методы так, чтобы сначала была напечатана информация про Пикселя, а потом про Байта. Порядок вывода такой:
сперва приветствие, затем стоимость самого дорогого корма и общие траты на него, затем пожелание приятного аппетита.*/
