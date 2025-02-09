package JavaCore.Kurs14.Tema6;

public class Converter {
    double rateUSD;
    double rateEUR;
    double rateCNY;

    public Converter(double usd, double eur, double cny) {
        rateUSD = usd;
        rateEUR = eur;
        rateCNY = cny;
    }

    public void convert(double rubles, int currency) {
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