package Zadania4.zad12;

/**
 * 12. Usuń białe znaki (spacje, nowe linie, tabulatory) z końca i początku napisu "    ALA MA KOTA    " (trim())
 */
public class StringBiałeznaki {
    public static void main(String[] args) {
String zdanie = "    ALA MA KOTA    ";
        System.out.println (zdanie);
        System.out.println (zdanie.trim ());
    }
}
