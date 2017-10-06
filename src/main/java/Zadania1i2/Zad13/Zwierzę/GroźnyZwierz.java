package Zadania1i2.Zad13.Zwierzę;

public class GroźnyZwierz {
    private String imie;
    private int wiek;
    private String gatunek;

    public GroźnyZwierz(String imie, int wiek, String gatunek) {
        this.imie = imie;
        this.wiek = wiek;
        this.gatunek = gatunek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getGatunek() {
        return gatunek;
    }

    @Override
    public String toString() {
        return "GroźnyZwierz{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }
    public boolean czyGrozny() {
        return gatunek.equals("Lew") || gatunek.equals("Tygrys") || gatunek.equals("Rekin"); //można zapisać to dłużej z wykorzystaniem if else, ale po co?
    }
}
