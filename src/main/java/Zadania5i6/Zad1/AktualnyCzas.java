package Zadania5i6.Zad1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 1. (Poziom 1) Wypisz na ekranie aktualny czas, datę oraz czas i datę.
 */
public class AktualnyCzas {
    public static void main(String[] args) {
        LocalDate aktualnaData = LocalDate.now ();
        System.out.println(aktualnaData);

        LocalTime aktualnyCzas  = LocalTime.now ();
        System.out.println (aktualnyCzas);

        LocalDateTime aktualnaDataICzas = LocalDateTime.now ();
        System.out.println (aktualnaDataICzas);


    }
}
