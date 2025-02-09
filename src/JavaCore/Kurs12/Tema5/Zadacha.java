package JavaCore.Kurs12.Tema5;

public class Zadacha {
    public static void main(String[] args) {
        String highestGrossingFilm = findHighestGrossingFilm();
        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);
    }

    public static String findHighestGrossingFilm() {
        String film1 = "Титаник";
        int income1 = 2194;

        String film2 = "Аватар";
        int income2 = 2810;

        String film3 = "Тёмный рыцарь";
        int income3 = 1084;

        if (income1 > income2) {
            if (income1 > income3) {
                return film1;
            } else {
                return film3;
            }
        } else if (income2 > income3) {
            return film2;
        } else {
            return film3;
        }
    }
}
/*Вам нужно дописать реализацию метода findHighestGrossingFilm(), который выбирает самый кассовый фильм
из трёх предложенных вариантов —  хитов Джеймса Кэмерона «Титаник» и «Аватар» и блокбастера Кристофера
Нолана «Тёмный рыцарь».

Названия фильмов и их сборы заранее сохранены в соответствующих переменных. Метод должен сравнить суммы
сборов и вернуть значение — название фильма, заработавшего в прокате больше всего.*/