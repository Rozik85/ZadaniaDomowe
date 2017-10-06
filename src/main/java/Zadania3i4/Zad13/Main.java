package Zadania3i4.Zad13;

/**
 * 13. (Poziom 3) Napisz metodę (w klasie CharCounter), liczącą liczbę wystąpienia znaku w tekście.
 *  Np. dla napisu "ala ma kota kot ma mleko" i literki "a" metoda zwróci wartość 5.
 * Tip: możesz spróbować zrealizować zadanie używając metod contains, substring i indexOf klasy String.
 */
public class Main {
    public static void main(String[] args) {
        CharCounter charCounter = new CharCounter ();
        System.out.println (charCounter.liczbaWystąpieńZnaku ("a", "ala ma kota kot ma mleko"));

    }
}
