package Zadania1i2.Zad4;

import java.util.Scanner;

/**
 * 4. (Poziom 2) Napisz program, który będzie pobierał od użytkownika liczbę całkowitą i
 * wypisywał najmniejszą i największą dotychczas wprowadzoną liczbę (liczby wczytujemy w pętli). Podanie wartości -1 kończy pętlę.
 */
public class PętlaMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        System.out.println("podaj liczbę");
        liczba = scanner.nextInt();
                int min = liczba;
                int max = liczba;

        do{
            System.out.println("podaj liczbę");
            liczba = scanner.nextInt();
            if (liczba>max){
                max = liczba;
            }
            if (liczba<min){
                min = liczba;
            }
            System.out.printf("Minimum: %d, maximum: %d\n", min, max);
    }
    while (liczba!=-1);
        System.out.println("Koniec");
}}
