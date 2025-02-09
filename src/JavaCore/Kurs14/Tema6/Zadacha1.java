package JavaCore.Kurs14.Tema6;

public class Zadacha1 {
    double rateUSD;
    double rateEUR;
    double rateCNY;

    Zadacha1(double usd, double eur, double cny) {
        rateUSD = usd;
        rateEUR = eur;
        rateCNY = cny;
    }

    void convert(double rubles, int currency) {
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
/*Добавьте конструктор в класс для конвертера валют, который вы написали в прошлом уроке. Значения полей
должны передаваться в качестве параметров со следующими названиями: usd, eur, cny.
Обратите внимание: для правильной проверки вашего кода порядок параметров должен совпадать с порядком
объявления полей.*/