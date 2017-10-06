package Zadania3.Zad4.Bronie;

import Zadania3.Zad4.Potwory.Potwór;
import Zadania3.Zad4.Potwory.RodzajPotwora;

public abstract class Miecz implements Broń{
    private static final int FIZYCZNY_OBRAZENIA = 324;
    private static final int LATAJACY_OBRAZENIA = 0;
    private static final int MAGICZNY_OBRAZENIA = 10;

    @Override
    public boolean atakuj(Potwór potwór) {
        int monsterZycie = potwór.getŻycie ();
        RodzajPotwora monsterClass = potwór.getRodzajPotwora ();
        boolean czyPrzezyl = true;
        switch(monsterClass) {
            case FIZYCZNY:
                czyPrzezyl = monsterZycie - FIZYCZNY_OBRAZENIA <= 0;
                break;
            case LATAJACY:
                czyPrzezyl = monsterZycie - LATAJACY_OBRAZENIA <= 0;
                break;
            case MAGICZNY:
                czyPrzezyl = monsterZycie - MAGICZNY_OBRAZENIA <= 0;
        }
        return czyPrzezyl;
    }
}
