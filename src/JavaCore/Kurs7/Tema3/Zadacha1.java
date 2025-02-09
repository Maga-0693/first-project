package JavaCore.Kurs7.Tema3;

public class Zadacha1 {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0) {
                System.out.println("Яндекс");
            } else if (i % 5 == 0) {
                System.out.println("Практикум");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Яндекс.Практикум");
            } else {
                System.out.println(i);
            }
        }
    }
}

/*Золотая классика задачек на программирование! Напишите программу, которая для чисел, кратных 3,
печатает «Яндекс», для чисел, кратных 5 — «Практикум», а для чисел, кратных одновременно 3 и 5 — «Яндекс.Практикум».
В других случаях программа должна печатать само число.*/