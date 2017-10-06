package Zadania3.Zad4;

import Zadania3.Zad4.Bronie.MagicznyKij;
import Zadania3.Zad4.KlasyBohatera.Bohater;
import Zadania3.Zad4.KlasyBohatera.Czarodziej;
import Zadania3.Zad4.Miejsce.Miejsce;

public class Main {
    public static void main(String[] args) {
        Bohater czarodziejka = new Czarodziej ("Salme", new MagicznyKij (), 3);
        czarodziejka.podróż (Miejsce.BEZDROZE);
    }
}
