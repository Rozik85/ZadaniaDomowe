package Zadania1.Zad4;

import java.util.Scanner;

/*
 * 4. Napisz program, który zapyta ożytkownika o wiek, a następnie wypisze czy jest pełnoletni
 4.a Dodaj zabezpieczenie przed wpisaniem liczby mniejszej niż 1 oraz wypisanie specjalnego komunikatu, kiedy użytkownik ma więcej niż 100 lat
 4.b Zrealizuj zabezpieczenie za pomocą wyjątku
 */
public class Pełnoletni3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wiek;
        do {
            System.out.println("Podaj swój wiek");
            wiek = scanner.nextInt();
        }
        while (wiek < 1);
        if (wiek >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Jesteś niepełnoletni");
        }
    }
}
