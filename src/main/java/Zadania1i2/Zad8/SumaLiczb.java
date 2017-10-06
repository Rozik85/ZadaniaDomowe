package Zadania1i2.Zad8;

import java.util.Scanner;

/**
 * 8. (Poziom 1) Napisz program, który pobiera od użytkownika liczby całkowite aż do napotkania liczby 100.
 * Kiedy użytkownik poda liczbę 100, program wypisuje sumę po	danych liczb, ich średnią oraz ilość liczb podzielnych przez 3.
 */
public class SumaLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        int licznik = 0;
        int suma = 0;
        int srednia;
        int dzielnik = 0;
        do {
            System.out.println("Podaj liczbę");
            liczba = scanner.nextInt();
            suma += liczba;
            licznik++;

            if (liczba % 3 == 0) {
                dzielnik++;
            }

        }
        while (liczba != 100);
        suma = suma-100;
        srednia = suma / (licznik-1);
        System.out.println("Suma:" + suma);
        System.out.println("Srednia:" + srednia);
        System.out.println("Ilośc liczb podzielnych przez 3:" + dzielnik);

    }
}
