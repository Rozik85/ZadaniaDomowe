package Zadania3.Zad4.Miejsce;

import Zadania3.Zad4.Potwory.Jin;
import Zadania3.Zad4.Potwory.Potwór;
import Zadania3.Zad4.Potwory.RodzajPotwora;
import Zadania3.Zad4.Potwory.Smok;
import Zadania3.Zad4.Potwory.Wampir;

public enum Miejsce {
    BEZDROZE (new Smok ("Diablik", RodzajPotwora.LATAJACY, 50)),
    LOCH (new Wampir ("Dracula", RodzajPotwora.FIZYCZNY, 30)),
    Niebo (new Jin ("Pyrkuś", RodzajPotwora.MAGICZNY, 20));

    private final Potwór potwór;

    Miejsce(Potwór potwór) {
        this.potwór = potwór;
    }

    public Potwór getPotwór() {
        return potwór;
    }

}

