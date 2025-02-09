package JavaCore.Kurs13.Tema2;
import java.util.Scanner;
public class Zadacha1 {
    public static void main(String[] args) {

        int balls = 15;
        System.out.println("У Пикселя " + balls + " мячиков");
        playPixel(balls);
        System.out.println("Пиксель вернул все мячики");
        System.out.println("Их снова " + balls);
    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячиков спрятал Пиксель?");
        int hiddenBalls = scanner.nextInt();
        balls = balls - hiddenBalls;
        System.out.println("Осталось " + balls);
    }
}
/*Кот Пиксель очень любит играть с мячиками — всего их у него 15. Днём он повсюду их прячет
(число спрятанных мячиков считывается из консоли), но вечером всегда возвращает на место.

Расставьте переменные balls и hiddenBalls в коде так, чтобы программа смогла правильно посчитать
количество мячиков у Пикселя до начала игры, во время неё и в конце дня.*/
