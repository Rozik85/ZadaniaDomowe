package Zadania2.Zad1;

/**
 * 1. Utwórz klasę punkt, posiadającą pola publiczne: double x, double y. Utwórz dwa obiekty tej klasy w funkcji main i wyświetl ich zawartość.
 */
public class Punkt1 {
    double x;
    double y;

    public Punkt1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
       Punkt1 punkt = new Punkt1(2.5,6.4);
       Punkt1 punkt1 = new Punkt1(1.1,7.7);

        System.out.println(punkt);
        System.out.println(punkt1.toString());
    }
}
