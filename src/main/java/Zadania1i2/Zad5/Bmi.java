package Zadania1i2.Zad5;

/*
  /**
  5. (Poziom 1) Napisz program, który pobiera od użytkownika wzrost i wagę.
  Następnie oblicza jego BMI wg wzoru: waga/(wzorst*wzrost) i wypisuje na ekranie.
 */

import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj swój wzrost w metrach");
        double wzrost = scanner.nextDouble ();
        System.out.println ("Podaj swoją wagę w kg");
        double waga = scanner.nextDouble ();
        Bmi bmi = new Bmi ();
        System.out.println (bmi.obliczanieBmi (wzrost, waga));

    }
    private double obliczanieBmi(double wzrost, double waga){
        return waga/(wzrost*wzrost);
    }
}
