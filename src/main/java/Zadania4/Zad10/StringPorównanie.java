package Zadania4.Zad10;



/**
 * 10. Sprawdź czy napisy "Ala ma kota" i "ALA MA KOTA" są takie same (equals(), equalsIgnoreCase())
 */
public class StringPorównanie {
    public static void main(String[] args) {
        String zdanie1 = "Ala ma kota";
        String zdanie2 = "ALA MA KOTA";
        System.out.println (zdanie1.equals (zdanie2));
        System.out.println (zdanie1.equalsIgnoreCase (zdanie2));
    }
}
