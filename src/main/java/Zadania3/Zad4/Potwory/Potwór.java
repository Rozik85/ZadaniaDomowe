package Zadania3.Zad4.Potwory;

public abstract class Potwór {

    private String nazwa;
    private RodzajPotwora rodzajPotwora;
    private int życie;

    public Potwór(String nazwa, RodzajPotwora rodzajPotwora, int życie) {
        this.nazwa = nazwa;
        this.rodzajPotwora = rodzajPotwora;
        this.życie = życie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public RodzajPotwora getRodzajPotwora() {
        return rodzajPotwora;
    }

    public int getŻycie() {
        return życie;
    }
}
