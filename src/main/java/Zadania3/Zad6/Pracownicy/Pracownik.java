package Zadania3.Zad6.Pracownicy;

public class Pracownik {
    private String imię;
    private int pensja;

    @Override
    public String toString() {
        return "Pracownik{" +
                "imię='" + imię + '\'' +
                ", pensja=" + pensja +
                '}';
    }

    public String getImię() {
        return imię;
    }

    public int getPensja() {
        return pensja;
    }

    public Pracownik(String imię, int pensja) {

        this.imię = imię;
        this.pensja = pensja;
    }
}
