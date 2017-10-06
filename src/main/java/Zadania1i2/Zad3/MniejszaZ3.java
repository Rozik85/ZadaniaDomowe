package Zadania1i2.Zad3;

import java.util.Scanner;

/**
 * 3. (Poziom 2) Napisz program, który pobierze od użytkownika 3 liczby całkowite i wypisze najmniejszą i największą z nich.
 */
public class MniejszaZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min,max;
        System.out.println("Podaj pierwszą liczbę:");
        int pierwsza = scanner.nextInt();
        min = pierwsza;
        max =pierwsza;
        System.out.println("Podaj drugą liczbę:");
        int druga = scanner.nextInt();
        if (min>druga){
            min = druga;}
        if (max<druga){
            max = druga;}
        System.out.println("Podaj trzecią liczbę:");
        int trzecia = scanner.nextInt();
        if(max<trzecia){
            max = trzecia;
        }
        if (min>trzecia){
            min = trzecia;
        }
        System.out.printf("Minimum: %d, maximum: %d\n", min, max);
    }
}
