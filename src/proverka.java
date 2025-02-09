import java.util.ArrayList;
public class proverka {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add (92.3);
        expenses.add (12.4);
        expenses.add (74.1);
        expenses.add (45.0);

        double max = 0;
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i) > max) {
                max = expenses.get(i);
            }
        }
        System.out.println("Самое большое значение: " + max);
    }
}
