package Zadania1i2.Zad13;

import Zadania1i2.Zad13.Zwierzę.GroźnyZwierz;

/**
 * 13. (Poziom 2) Napisz klasę Zwierzę z polami: String imie, int wiek, String gatunek. Oprócz standardowych metod
 * (konstruktory, gettery, settery, equals, toString)
 * dodaj metodę czyGrozny zwracającą prawdę, jeśli gatunek to "Lew", "Tygrys" lub "Rekin" i fałsz w przeciwnym wypdaku.
 */
public class Main {
    public static void main(String[] args) {
        GroźnyZwierz[] zoo = {new GroźnyZwierz("Leon", 2, "Lew"),
                new GroźnyZwierz("Jadźka", 3, "Owca"),
                new GroźnyZwierz("Reksio", 1, "Rekin")
        };

        for (GroźnyZwierz zwierze: zoo) {
            if(zwierze.czyGrozny()) {
                System.out.println(zwierze.getGatunek() + " " + zwierze.getImie() + " jest groźnym zwierzęciem! Lepiej uciekaj");
            }
            else {
                System.out.println(zwierze.getGatunek() + " " + zwierze.getImie() + " nie jest groźnym zwierzęciem - można pogłaskać");
            }
        }


    }
}
