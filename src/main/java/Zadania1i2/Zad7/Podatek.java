package Zadania1i2.Zad7;

import java.util.Scanner;

/**
 * 7. (Poziom 1) Napisz program, który oblicza należny podatek dochodowy od wprowadzonej przez użytkownika kwoty wg. poniższych reguł:
 - do kwoty 33000 zł - 18%
 - powyżej kwoty 33000 zł - 32% od nadwyżki.
 */
public class Podatek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę");
        double kwota = scanner.nextDouble();
double podatek;
        if (kwota<33000){
            podatek = kwota*18/100;
        }
        else{
            podatek = (33000*18/100)+((kwota-33000)*32/100);
        }
        System.out.println(podatek);
    }
}
