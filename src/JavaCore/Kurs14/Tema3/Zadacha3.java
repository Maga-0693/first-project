package JavaCore.Kurs14.Tema3;

public class Zadacha3 {

    static double rateUSD = 94.8;
    static double rateEUR = 103.8;
    static double rateCNY = 13.1;

   public static void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в юанях: " + rubles / rateCNY);
        } else {
            System.out.println("Введена неизвестная валюта.");
        }
    }
}
/*Вам нужно научить конвертер рассчитывать соотношение валют. Для этого объявите метод convert.
Этот метод должен принимать такие параметры: сумма в рублях (double rubles) и код валюты (int currency).
Объявите метод и поместите в него логику конвертации валюты.

В нашем случае вместо класса Convert - Zadacha3
Переменным валютам и методу присвоено статистическое значение, а методу еще и публичное*/