package Zadania3i4.Zad5;

/**
 * 5. (Poziom 2) Zaprojektuj hierarchię klas: klasę bazową Budynek z polami wysokość, szerokość i długość oraz metodą powierzchnia,
 * zwracającą iloczyn szerokości i długości; DomPiętrowy (rozszerza klasę budynek),
 * przeciążający metodę powierzchnia (powierznię trzeba pomnożyć x 2 - bo mamy parter i piętro) oraz Wieżowiec (rozszerza klasę Budynek)
 * z polem liczbaPięter, przeciążający metodę powierzchnia (powierzchnię trzeba pomnożyć przez (liczbę pięter + parter).
 */
public class Main {
    public static void main(String[] args) {

        Budynek budynek = new Budynek (5.2,2.4,3.4);
        Budynek domPiętrowy = new DomPiętrowy (7, 2.4,3.4);
        Budynek wieżowiec = new Wieżowiec (30, 2.4,3.4,6);
        System.out.println ("Powierzchnia budynku= "+budynek.powierzchnia ());
        System.out.println ("Powierzchnia dom piętrowy= "+domPiętrowy.powierzchnia ());
        System.out.println ("Powierzchnia wieżowca= "+wieżowiec.powierzchnia ());
    }
}
