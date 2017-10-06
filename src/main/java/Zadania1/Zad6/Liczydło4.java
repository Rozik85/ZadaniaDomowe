package Zadania1.Zad6;

import java.util.Random;
import java.util.Scanner;

/*
 *
 * 6. Napisz program, który będzie sprawdzał, czy liczba wpisana przez użytkownika jest równa pewnej zdefiniowanej liczbie od 1 do 10.
 * Jeśli użytkownik trafi, program wyświetli odpowiedni komunikato i zakończy działanie.
 * 6.a Napisz program, który działa na liczbie losowej.
 */
public class Liczydło4 {
    public static void main(String[] args) {
//        for (int i = 0; i < 101; i++) {
//            System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę od 0 do 100:");
//        int liczba = scanner.nextInt();
//        System.out.print("dzielnik liczby "+liczba+" to: ");
//        for(int i=1;i<=liczba/2;i++){
//            if (liczba%i==0){
//                System.out.print(i+",");
//            }
//        }


        Random rnd = new Random();
        int a = rnd.nextInt(10);
        int liczba2;
        do {
            System.out.println("Podaj liczbę od 0 do 10");
            liczba2 = scanner.nextInt();
        }
        while (a != liczba2);
        System.out.println("To jest ta liczba");
    }
}
