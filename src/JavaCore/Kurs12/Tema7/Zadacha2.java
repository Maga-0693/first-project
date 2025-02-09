package JavaCore.Kurs12.Tema7;

public class Zadacha2 {
    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses);
        System.out.println("Самая большая трата недели " + maxExpense);
    }

    public static double findMaxExpense(double[] expenses) {
        double maxExpense = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }
}
/*Объявите и реализуйте метод findMaxExpense — он должен находить в списке расходов за неделю самую
большую трату и возвращать её значение. В качестве единственного параметра этого метода укажите массив
расходов expenses.*/