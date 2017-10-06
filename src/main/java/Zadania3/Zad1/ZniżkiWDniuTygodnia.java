package Zadania3.Zad1;

/**
 * 1. Zaprojektuj typ Enum, który będzie umożliwiał pobranie procentu zniżki w zależności od dnia tygodnia.
 */
public enum ZniżkiWDniuTygodnia {
    PONIEDZIAŁEK(5),
    WTOREK (3),
    ŚRODA (2),
    CZWARTEK(7),
    PIĄTEK(4),
    SOBOTA(1),
    NIEDZIELA(4);

    private int znizka;

    ZniżkiWDniuTygodnia(int znizka) {
        this.znizka = znizka;
    }
}
