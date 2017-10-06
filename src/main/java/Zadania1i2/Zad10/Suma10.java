package Zadania1i2.Zad10;

import java.util.Scanner;

/**
 * 10. (Poziom 1) Napisz program, który pobiera od użytkownika 10 wartości całkowitych i umieszcza je w tablicy.
 * Następnie wypisze sumę elementów, ich średnią, wartość najmniejszą i największą.
 */
public class Suma10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] tablicaPodanychLiczb = new int[10];
int suma = 0;
double minimalna=0, maxymalna=0;
        System.out.println("Podaj 10 elementów tablicy:");
        for (int i = 0; i < tablicaPodanychLiczb.length; i++) {

            tablicaPodanychLiczb[i] = scanner.nextInt();
            suma+=tablicaPodanychLiczb[i];
            if (i==0){
                minimalna = tablicaPodanychLiczb[0];
                maxymalna = tablicaPodanychLiczb[0];
            }
            if (tablicaPodanychLiczb[i]> maxymalna){
                maxymalna = tablicaPodanychLiczb[i];
            }
           else if (tablicaPodanychLiczb[i]< minimalna){
                minimalna = tablicaPodanychLiczb[i];
            }
        }
        double średnia = (double)suma/tablicaPodanychLiczb.length;

        System.out.println("Suma podanych licz to: "+suma);
        System.out.println("Srednia podanych liczb to:"+średnia);
        System.out.printf("Minimalna z podanych to %.2f\nMaxymalna z podanych to %.2f\n",minimalna, maxymalna );
    }
}
//public static void User(String[] args) {
//
//Scanner scanner = new Scanner(System.in);
//
//    int [] tablica = new int[10];
//        System.out.println("Podaj dziesięć liczb");
//
//        for (int i = 0; i < tablica.length; i++) {
//        tablica[i] = scanner.nextInt();
//    }
//
//        System.out.println("Minimum: " + minimum(tablica));
//        System.out.println("Maximum: " + maximum(tablica));
//        System.out.println("Suma: " + suma(tablica));
//        System.out.printf("średia: %.2f\n", srednia(tablica));
//
//
//}
//
//    private static int minimum(int [] tablica) { //jeśli chcemy korzystać z napisanych metod w statycznej funkcji User, to te metody też muszą być statyczne
//        int min = tablica[0]; //inicjalizujemy zmienną int pierwszym elementem tablicy, następnie będziemy ja porónywać z następnymi w razie potrzeby aktualizować.
//        for (int i = 1; i < tablica.length; i++) { // zauważ, że zaczynamy od drugiego elementu - pierwszy jest już w zmiennej min
//            if(min > tablica[i]) {
//                min = tablica[i];
//            }
//        }
//        return min;
//    }
//
//    private static int maximum(int [] tablica) {
//        int max = tablica[0]; //analogicznie j. w.
//        for (int i = 1; i < tablica.length; i++) {
//            if(max < tablica[i]) {
//                max = tablica[i];
//            }
//        }
//        return max;
//    }
//
//    private static int suma(int [] tablica) {
//        int suma = 0;
//        for (int i = 0; i < tablica.length; i++) { //iterujemy po tablicy i sumujemy jej elementy
//            suma += tablica[i];
//        }
//        return suma;
//    }
//
//    private static double srednia(int [] tablica) {
//        int sum = suma(tablica); //korzystamy z wcześniej napisanej funkcji
//        return 1.0 * sum / tablica.length;
//    }
//}