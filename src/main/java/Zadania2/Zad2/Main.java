package Zadania2.Zad2;

/**
 * 2. Dodaj do klasy punkt gettery (accessor) i settery (mutuator) oraz metodę double distance(Point other), obliczającą odległość euklidesową.
 * Wzór: sqrt((x1-x2)^2 + (y1-y2)^2)
 */
public class Main {


    public static void main(String[] args) {
        Punkt2 punkt2 = new Punkt2(2,7);
        Punkt2 punkt21 = new Punkt2(1,2);

        System.out.println(punkt2);
        System.out.println(punkt21);


        System.out.printf("Wynik to %.2f z tabel %n%s oraz %s", Punkt2.distance(punkt2, punkt21), punkt2, punkt21);


    }
}
