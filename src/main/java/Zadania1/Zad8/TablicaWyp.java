package Zadania1.Zad8;

import java.util.Scanner;

/**
 * 8. Napisz program, który przechowa w tablicy liczby wpisane przez użytkownika, a kiedy tablica zostanie wypełniona, wypisze je i zakończy działanie.
 8.a Zmodyfikuj program tak, żeby w tablicy trzymanych było 10 ostatnich wpisów
 (po wypełnieniu pierwszy element jest usuwany, reszta jest przesuwana i kolejny element zapisywany jest na końcu).
 */
public class TablicaWyp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilośc elementów:");
        int size= scanner.nextInt();
        int[] tablica = new int[size];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj element nr:"+i);
            tablica[i]= scanner.nextInt();
        }
        for (int i = 0; i <tablica.length ; i++) {
            System.out.print("["+tablica[i]+"]");
        }
     }
}
