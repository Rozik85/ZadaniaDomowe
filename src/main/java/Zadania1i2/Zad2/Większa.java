package Zadania1i2.Zad2;

import java.util.Scanner;

/**
 * 2. (Poziom 1) Napisz program, któy pobierze od użytkownika 2 liczby całkowite i
 * wypisze na ekranie, która z nich jest większa, np. "Liczba 5 jest większa od liczby 3"
 */
public class Większa {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj pierwzą liczbę:");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        if (a>b){
            System.out.println(a+" jest większa od "+b);
        }
        if (a<b){
            System.out.println(b+" jest większa od "+a);
        }
        else {
            System.out.println("Podane cyfry są takie same");
        }
    }
}
