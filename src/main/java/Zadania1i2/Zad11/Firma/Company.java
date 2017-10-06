package Zadania1i2.Zad11.Firma;

public class Company {
    String nazwaFirmy;
    String adres;
    String nip;
    int liczbaPracowników;

    public Company(String nazwaFirmy, String adres, String nip, int liczbaPracowników) {
        this.nazwaFirmy = nazwaFirmy;
        this.adres = adres;
        this.nip = nip;
        this.liczbaPracowników = liczbaPracowników;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nazwaFirmy='" + nazwaFirmy + '\'' +
                ", adres='" + adres + '\'' +
                ", nip='" + nip + '\'' +
                ", liczbaPracowników=" + liczbaPracowników +
                '}';
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getLiczbaPracowników() {
        return liczbaPracowników;
    }

    public void setLiczbaPracowników(int liczbaPracowników) {
        this.liczbaPracowników = liczbaPracowników;
    }
}
