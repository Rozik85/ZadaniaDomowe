package Zadania1i2.Zad6;

import java.util.Scanner;
/**
 * 6. (Poziom 2) Napisz program, który pobiera od użytkownika wzrost i wagę. Następnie oblicza jego BmiZOpisem wg wzoru:
 * waga/(wzorst*wzrost) i jeśli BmiZOpisem mieści się w przedziale 18.5-24.9,
 * wypisze "Masz prawidłową wagę", jeśli poniżej tego przedziału, "Masz niedowagę", a jeśli powyżej przedziału, "Masz nadwagę".
 */

public class BmiZOpisem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wzrost w metrach");
        double wzrost = scanner.nextDouble();
        System.out.println("Podaj wagę w kg:");
        double waga = scanner.nextDouble();

        obliczBMI(wzrost, waga);
    }

    private static void obliczBMI(double wzrost, double waga) {
        double wynikBmi = waga/(wzrost*wzrost);
        System.out.println("BmiZOpisem = "+wynikBmi);
        if (wynikBmi >24.9){
            System.out.println("Masz nadwagę");
        }
        else if (wynikBmi<18.5){
            System.out.println("Masz niedowagę");
        }
        else {
            System.out.println("Prawidłowa waga");
        }
    }
}
