package Zadania1.Zad5;

import java.util.Scanner;

/*
 * 5. Napisz program, który policzy do stu
 * 5.a Napisz program, który wypisze wszystkie dzielniki zadanej liczby w przedziale od 0 do 100
 * 5.b Napisz program, który wypisze wszytkie liczby pierwsze od 0 do 1000
 */
public class LiczyćDoStu {
    /*
     * Zad 5
     */
    public static void main(String[] args) {
        for (int i = 0; i<101; i++) {
            System.out.println (i);
        }

        /*
         * Zad 5a
         */
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj liczbę z przedziału od 1 do 100");
        int liczbaPodana = scanner.nextInt ();
        for (int i = 1; i<liczbaPodana / 2; i++) {
            if (liczbaPodana % i == 0) {
                System.out.print (i + " ");
            }
        }

        /*
         * Zad 5b
         */

    }
}
