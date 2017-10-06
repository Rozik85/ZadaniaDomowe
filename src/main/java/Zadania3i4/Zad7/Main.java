package Zadania3i4.Zad7;

/**
 * 7. (Poziom 2) Zaprojektuj interfejs Pojazd z metodą jedź oraz Motorówka z metodą płyń. Zaprojektuj klasę Amfibia, implemenującą oba te interfejsy.
 */
public class Main {
    public static void main(String[] args) {

        Amfibia amfibia = new Amfibia ();
        amfibia.jedz ();
        amfibia.płyń ();

        Pojazd pojazd = new Amfibia ();
        pojazd.jedz ();

        Motorówka motorówka = new Amfibia ();
        motorówka.płyń ();
    }
}
