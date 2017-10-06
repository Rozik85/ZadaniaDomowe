package Zadania3i4.Zad2;

import java.util.Scanner;

/**
 * 2. (Poziom 2) Zaprojektuj typ enum, składający się z nazw kilku marek telefonów.
 * Do każdej z marek powinno być przypisane pole przechowujące informację w formie liczby całkowitej określające popularność danej marki (od 1 do 3).
 * Pobierz od użytkownika markę telefonu i wyświetl informację jak popularna jest marka używając zdefiniowanego typu Enum.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj markę telefonu");
        String markaNapis = scanner.nextLine();

        switch(markaNapis.toUpperCase()) {

            case "SAMSUNG":
        wypiszMarkę(MarkiTelefonów.SAMSUNG);
        break;
        case "NOKIA":
        wypiszMarkę(MarkiTelefonów.NOKIA);
        break;
        case "IPHONE":
        wypiszMarkę(MarkiTelefonów.IPHONE);
        break;
        case "LG":
        wypiszMarkę(MarkiTelefonów.LG);
        break;
        case "SONY":
        wypiszMarkę(MarkiTelefonów.SONY);
        break;
        default:
        System.out.println("Nie znam tej marki");



    }
    }
    public static void wypiszMarkę(MarkiTelefonów markiTelefonów) {
        System.out.println("Wybrana marka to " + markiTelefonów + ", jej popularność jest równa " + markiTelefonów.getPopularnosc());
    }
}
