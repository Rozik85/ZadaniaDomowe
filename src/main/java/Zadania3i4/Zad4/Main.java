package Zadania3i4.Zad4;

/**
 * 4. (Poziom 2) Zaprojektuj klasę Samochód z polem enum TypAuta, stwórz kilka obiektów tej klasy.
 * Pole TypAuta powinno być inicjowane w konstruktorze.
 */
public class Main {
    public static void main(String[] args) {
        Samochó renault = new Samochó (TypAuta1.OSOBOWY, "Laguna");
        Samochó iveco = new Samochó (TypAuta1.CIEŻAROWY, "Stralis");
        Samochó ferari = new Samochó (TypAuta1.SPORTOWY, "F50");

        System.out.println (renault);
        System.out.println (iveco);
        System.out.println (ferari);
    }
}
