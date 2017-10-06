package Zadania1i2.Zad11;

import Zadania1i2.Zad11.Firma.Company;

import java.util.Scanner;

/**
 * 11. (Poziom 2) Napisz program, który pobiera od użytkownika dane o 3 firmach: nazwę firmy, adres, nip (jako łańcuch znaków) i liczbę pracowników.
 * Dane umieszczane są w obiektach utworzonej klasy Company (lub Firma) i przechowywane w tablicy. Następnie program wypisuje zawartość tej tablicy.
 */

public class main {
    public static void main(String[] args) {
        Company[] tablicaFirm = new Company[3];
        for (int i = 0; i <tablicaFirm.length ; i++) {
            tablicaFirm[i] = pobierzFirmę();
        }

        wypiszFirmy (tablicaFirm);
    }

    private static void wypiszFirmy(Company[] tablicaFirm) {
        for (int i = 0; i < tablicaFirm.length; i++) {
            System.out.println(i + ":"+ tablicaFirm[i]);
        }
    }

    private static Company pobierzFirmę() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane firmy");
        System.out.println("Podaj nazwę firmy");
        String nazwa = scanner.nextLine();
        System.out.println("Podaj adres firmy");
        String adres = scanner.nextLine();
        System.out.println("Podaj NIP");
        String nip = scanner.nextLine();
        System.out.println("Podaj ilość pracowników");
        int ilośćPracowników = scanner.nextInt();

        return new Company(nazwa, adres, nip, ilośćPracowników);
    }


}