package JavaCore.Kurs19.Tema7;

import java.util.ArrayList;
import java.util.HashMap;

public class Zadacha {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();

        ArrayList<Integer> january = new ArrayList<>();
        january.add(1);
        january.add(7);

        ArrayList<Integer> february = new ArrayList<>();
        february.add(23);

        ArrayList<Integer> march = new ArrayList<>();
        march.add(8);

        ArrayList<Integer> may = new ArrayList<>();
        may.add(1);
        may.add(9);

        ArrayList<Integer> june = new ArrayList<>();
        june.add(12);

        ArrayList<Integer> november = new ArrayList<>();
        november.add(4);


        stateHolidays.put("Январь", january);
        stateHolidays.put("Февраль", february);
        stateHolidays.put("Март", march);
        stateHolidays.put("Май", may);
        stateHolidays.put("Июнь", june);
        stateHolidays.put("Ноябрь", november);

        System.out.println(stateHolidays);
    }
}
/*Напишите хеш-таблицу государственных праздников stateHolidays, которая будет содержать месяцы и праздничные даты:
Январь — 1, 7;
Февраль — 23;
Март — 8;
Май — 1, 9;
Июнь — 12;
Ноябрь — 4.*/