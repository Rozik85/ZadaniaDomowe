package Zadania1.Zad7;

import java.util.Scanner;

/*
 *
 * 7. Napisz program, który będzie wczytywał od użytkownika znak (np. +, -, *) a następnie 2 liczby.
 * Wyświetli wynik odpowiedniej operacji i znów zapyta o znak i dwie liczby. Jeśli znak równy będzie ‘q’ lub ‘Q’, zakończ program.
 */
public class obliczenia7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę:");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("Podaj 2 liczbę:");
        int drugaLiczba = scanner.nextInt();
        System.out.println("Podaj działanie: 1=+; 2=-;3=*;4=/");
        int działanie = scanner.nextInt();

        switch (działanie) {
            case 1:
                System.out.println(pierwszaLiczba + drugaLiczba);
                break;
            case 2:
                System.out.println(pierwszaLiczba - drugaLiczba);
                break;
            case 3:
                System.out.println(pierwszaLiczba * drugaLiczba);
                break;
            case 4:
                System.out.println(pierwszaLiczba / drugaLiczba);
                break;

        }
    }
}
