package Zadania3.Zad4.KlasyBohatera;

import Zadania3.Zad4.Bronie.Broń;
import Zadania3.Zad4.Miejsce.Miejsce;

public class Złodziej extends Bohater {
    public Złodziej(String name, Broń broń, int poziomBohatera) {
        super (name, broń, poziomBohatera);
    }

    @Override
    public void podróż(Miejsce miejsce) {
        System.out.println ("Idę do " + miejsce.name ());
        System.out.println ("Spotykasz potwora: " + miejsce.getPotwór ().getNazwa ());
        boolean czyWygrałem = getBroń ().atakuj (miejsce.getPotwór ());
        if (czyWygrałem) {
            System.out.println ("Wygrałem z potworem " + miejsce.getPotwór ().getNazwa ());
            zwiększPoziom ();
        } else {
            System.out.println ("Przegrałem ");
        }
    }
}
