package Zadania1i2.Zad1;

import java.util.Scanner;

/*
 * 1. (Poziom 1) Napisz program konwertujący temperaturę w stopniach Celsjusza na stopnie w skali Fahrenheita
 * (stopnie Fahrenheita = 1.8 * stopnieCelsjusza + 32.0)
 */
public class Stopnie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę:");
        double temperatura = scanner.nextDouble();

        temper(temperatura);

    }

    private static void temper(double temperatura) {
        double tempF = (temperatura*1.8)+32.00;
        System.out.println(tempF);
    }
}
