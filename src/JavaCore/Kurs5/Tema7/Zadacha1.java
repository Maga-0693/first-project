package JavaCore.Kurs5.Tema7;

public class Zadacha1 {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        double expense = 50;

        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
    }
}

/*Изучите код программы, которая автоматически заполняет массив расходов за неделю.
Найдите и исправьте допущенные ошибки.*/