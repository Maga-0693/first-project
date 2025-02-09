package JavaCore.Kurs12.Tema7;

public class Zadacha1 {
    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax());
        System.out.println("Наибольшее из чисел 16 и 5 = " + findMax(16, 5));
        System.out.println("Наибольшее из чисел 1 и 7 = " + findMax(1, 7));
    }

    public static int findMax() {
        int a = 5;
        int b = 3;
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
/*Метод findMax() сейчас может работать только с фиксированными значениями — 3 и 5. Исправьте код метода таким образом,
чтобы он мог принимать два любых целых значения. Затем по аналогии вызовите метод, чтобы напечатать результат
сравнения ещё двух пар чисел: 16 и 5, 1 и 7.*/