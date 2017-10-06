package Zadania3i4.Zad12;

/**
 * 12. (Poziom 2) Zmień napis: "    stado owiec jeździ rowerem   " na "STADO KRÓW JEŹDZI"
 */
public class Main {
    public static void main(String[] args) {
        String zdaniePierwsze = "    stado owiec jeździ rowerem   ";

        System.out.println (zdaniePierwsze.replace ("owiec", "krów").trim ().toUpperCase ().substring (0,17));
    }
}
