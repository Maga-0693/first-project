package JavaCore.Kurs19.Tema9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense, String category) {

        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);

        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            expenses.add(expense);
        } else {
            ArrayList<Double> expenses = new ArrayList<>();
            expenses.add(expense);
            expensesByCategories.put(category, expenses);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpensesByCategories() {

        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (int i = 0; i < expenses.size(); i++) {
                System.out.println(expenses.get(i));
            }
        }
    }

    double findMaxExpenseInCategory(String category) {

        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            double maxExpense = Double.MIN_VALUE;

            for (Double exp : expenses) {
                if (exp > maxExpense) {
                    maxExpense = exp;
                }
            }
            return maxExpense;
        } else {
            System.out.println("Такой категории пока нет.");
            return 0;
        }
    }

    void removeAllExpenses() {
        expensesByCategories.clear();
        System.out.println("Траты удалены.");
    }
}
