package Zadania3.Zad6;

import Zadania3.Zad6.Pracownicy.Księgowa;
import Zadania3.Zad6.Pracownicy.Magazynier;
import Zadania3.Zad6.Pracownicy.Ochroniaż;
import Zadania3.Zad6.Pracownicy.Pracownik;

/**
 * /**
 * 6. Napisz klasę Firma z polem budżetPłacowy, przechowującą listę/tablicę pracowników.
 * Firma posiada metodę dodaj pracownika. Pracownik to klasa abstrakcyjna z metodami pensja(), opisStanowiska(),
 * klasy które ją rozszerzają to Księgowa, Ochroniarz i Magazynier.
 * Do metody dodajPracownika klasy Firma dołóż rzucanie wyjątku BudżetPrzekroczonyException i obsłuż go w metodzie main.
 *
 */
public class Main {
    public static void main(String[] args) {
        Firma dim = new Firma ();
        try {
            dim.dodajPracownika (new Pracownik ("Jan", 2000));
            dim.dodajPracownika (new Księgowa ("Barbara", 3000));
            dim.dodajPracownika (new Ochroniaż ("Zenek",2500));
            dim.dodajPracownika (new Magazynier ("Bartek", 2500));
          //  dim.dodajPracownika (new Pracownik ("Dariusz", 3000));

        }
        catch (BudzetPrzekroczonyException e){
            e.printStackTrace ();
        }finally {
            dim.wypiszPracowników ();
        }
    }
}
