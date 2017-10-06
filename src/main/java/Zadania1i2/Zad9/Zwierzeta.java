package Zadania1i2.Zad9;

import java.util.Scanner;

/**
 * 9. (Poziom 2) Napisz program, który w zależnośći od podanego znaku wyświetli krótki opis zwierzęcia zaczynającego się na daną literę, np.
 "k" - "kot - ma cztery łapki, miauczy i łapie myszy"
 "w" - "wiewiórka - skacze po drzewach i zbiera orzechy"
 "a" - "anakonda - bardzo duży i groźny wąż"
 Zastosuj dla 5-7 zwierząt, dla reszty literek wypisz  tekst "Nie znam żadnego zwierzaka na tę literę"
 */
public class Zwierzeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą litere zwierzęcia: ");
        char pierwsza = scanner.nextLine().charAt(0);
        switch (pierwsza) {
            case 'k':
                System.out.println("k jak kot: kot miauczy");
                break;
            case 'p':
                System.out.println("p jak pies");
                break;
            case 's':
                System.out.println("s jak słoń");
                break;
            case 'm':
                System.out.println("m jak małpa");
                break;
            case 'z':
                System.out.println("z jak zebra");
                break;
            default:
                System.out.println("nie znam takiego zwierzęcia");
        }
    }

}
