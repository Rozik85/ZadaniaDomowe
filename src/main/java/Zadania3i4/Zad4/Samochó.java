package Zadania3i4.Zad4;

public class Samochó {

    private final TypAuta1 typAuta1;
    private String nazwa;

    public Samochó(TypAuta1 typAuta1, String nazwa) {
        this.typAuta1 = typAuta1;
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Samochó{" +
                "typAuta1=" + typAuta1 +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}