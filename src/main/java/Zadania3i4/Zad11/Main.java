package Zadania3i4.Zad11;

import java.util.Scanner;

/**
 * 11. (Poziom 1) Wczytaj imię od użytkownika, następnie wyświetl napis, np. "Cześć Gienek! Jak się masz?". Użyj StringBuildera i metody append().
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj swoje imię:");
        String imieUżytkownika = scanner.nextLine ();
        StringBuilder stringBuilder = new StringBuilder ();
        stringBuilder.append ("Cześć ").append (imieUżytkownika).append ("!. Jak się masz? ");
        String przywitanie = stringBuilder.toString ();
        System.out.println (przywitanie);

    }
}
