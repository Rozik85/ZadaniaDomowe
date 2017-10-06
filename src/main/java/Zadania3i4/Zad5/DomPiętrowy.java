package Zadania3i4.Zad5;

public class DomPiętrowy extends Budynek {
    @Override
    public double powierzchnia() {
        return super.powierzchnia ()* 2;
    }

    public DomPiętrowy(double wysokość, double szerokość, double długość) {
        super (wysokość, szerokość, długość);
    }
}
