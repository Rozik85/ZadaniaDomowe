package Zadania4.Zad8;

/**
 * 8. Wytnij z napisu "Ala ma kota, kot ma mleko" napis od 7 do 12 znaku (substring)
 */
public class StringWyciecie {
    public static void main(String[] args) {
        String zdanie = "Ala ma kota, kot ma mleko";
        System.out.println (zdanie.substring (0,6)+zdanie.substring (13));
    }
}
