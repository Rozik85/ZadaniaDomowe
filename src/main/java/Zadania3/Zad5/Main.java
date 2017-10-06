package Zadania3.Zad5;

import java.util.Scanner;

/**
 * 5. Napisz program odczytujący od użytkownika dwie liczby - dzielną i dzielnik.
 * Jeśli użytkownik jako dzielnik poda 0, rzuć wyjątek DzieleniePrzezZeroException i obsłuż go (wyświetl odpowiedni komunikat).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj dzielną liczbe: ");
        int dzielna = scanner.nextInt ();
        System.out.println ("Podaj dzielnik: ");
        int dzielnik = scanner.nextInt ();

        try {
            int dzielenie = dzielna/dzielnik;
            System.out.println (dzielenie);


        } catch (ArithmeticException e) {
            System.out.println ("Dzielisz przez 0");
            //     e.printStackTrace ();
        }
    }
}
