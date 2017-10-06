package Zadania2.Zad4;

/**
 * 4. Dodaj do klasy punkt metodę statyczną Point averagePoint(Point...points),
 * która przyjmuje zmienną liczbę argumentów i wylicza dla nich "średni" punkt (średnia z x-ów i średnia z y-ów)
 */
public class Main {
    public static void main(String[] args) {
        Punkt4 punkt = new Punkt4(4,5);

        System.out.println(Punkt4.averagePointX(punkt));
        System.out.println(Punkt4.averagePointY(punkt));
    }
}
