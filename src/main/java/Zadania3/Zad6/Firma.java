package Zadania3.Zad6;

import Zadania3.Zad6.Pracownicy.Pracownik;


public class Firma {
    private static final int MAX_BUDZET = 10000;
    private Pracownik[] pracownicy = new Pracownik[5];
    private int aktualnaLiczbaPracowników = 0;

    public void dodajPracownika(Pracownik pracownik)
            throws BudzetPrzekroczonyException {
        int aktualnyBudzet = 0;
        for (int i = 0; i<aktualnaLiczbaPracowników; i++) {
            aktualnyBudzet += pracownicy[i].getPensja ();
        }
        if (aktualnyBudzet + pracownik.getPensja ()>MAX_BUDZET) {
            throw new BudzetPrzekroczonyException ("Budżet przekroczony o" + ((aktualnyBudzet + pracownik.getPensja ()) - MAX_BUDZET));
        }
        pracownicy[aktualnaLiczbaPracowników] = pracownik;
        aktualnaLiczbaPracowników++;
    }
    public void wypiszPracowników(){
        for (int i = 0; i<aktualnaLiczbaPracowników; i++) {
            System.out.println (pracownicy[i]);
        }
    }
}
