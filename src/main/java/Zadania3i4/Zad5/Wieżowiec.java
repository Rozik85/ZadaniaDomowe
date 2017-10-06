package Zadania3i4.Zad5;

public class Wieżowiec extends Budynek{
    private int ilośćPięter;

    public Wieżowiec(double wysokość, double szerokość, double długość, int ilośćPięter) {
        super (wysokość, szerokość, długość);
        this.ilośćPięter = ilośćPięter;
    }

    @Override
    public double powierzchnia() {
        return super.powierzchnia ()*(1+ilośćPięter);
    }
}
