package Zadania3.Zad4.KlasyBohatera;

import Zadania3.Zad4.Bronie.Broń;
import Zadania3.Zad4.Miejsce.Miejsce;

/**
 * 4.
 * Zaprogramuj prostą grę. Utwórz klasę abstrakcyjną Bohater z metodami podroz(MiejsceEnum celPodrozy), zwiekszPoziom(),
 * którą będą rozszerzały klasy Wojownik, Czarodziejka i Złodziej. Utwórz klasę abstrakcyjną Potwór, którą rozszerzą klasy Wampir, Smok i Jin.
 * Utwórz interfejs Broń z polem int życie i metodą atak(Potwor potwor), którą zaimplementują klasy Miecz, Łuk, Topór, Sztylet i MagicznyKij.
 * Każda z broni powinna inaczej reagować (zadawać inne obrażenia) na każdy rodzaj potwora (potwór powinien mieć enum ze swoją
 * "klasą" - fizyczny, latający, magiczny).
 * W każdym z napotkanych miejsc gracz może spotkać losowego potwora, którego zaatakuje bronią, którą posiada. Kiedy gracz wygra, dostaje kolejny poziom.
 * Po przegranej wyświetlany jest aktualny poziom gracza.
 */
public abstract class Bohater {
    private String imie;
    private Broń broń;
    private int poziomBohatera;

    public Bohater(String imie, Broń broń, int poziomBohatera) {
        this.imie = imie;
        this.broń = broń;
        this.poziomBohatera = poziomBohatera;
    }

    public String getImie() {
        return imie;
    }

    public Broń getBroń() {
        return broń;
    }

    public int getPoziomBohatera() {
        return poziomBohatera;
    }

    public abstract void podróż(Miejsce miejsce);

    public void zwiększPoziom() {
        poziomBohatera++;
    }

}
