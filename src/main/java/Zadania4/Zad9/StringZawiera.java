package Zadania4.Zad9;

/**
 * 9. Sprawdź czy napis "Ala ma kota" zawiera napis "ALA" (contains). Nie zwracaj uwagi na wielkość liter (toUpperCase(), toLowerCase())
 */
public class StringZawiera {
    public static void main(String[] args) {
        String zdanie  = "Ala ma kota";
        System.out.println (zdanie.toUpperCase ().contains ("ALA"));
    }
}
