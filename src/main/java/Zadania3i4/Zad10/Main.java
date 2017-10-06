package Zadania3i4.Zad10;

/**
 * 10. (Poziom 2) Utwórz klasę User z polem String email.
 * Dodaj do niej metodę setEmail, która w trakcie działania wyrzuca wyjątek BadEmailException, kiedy w podanym napisie nie znajdzie się znak '@'.
 */
public class Main {

    public static void main(String[] args) {
        User user = new User (); //konstruktor bezargumentowy nie rzuca wyjątku - nie musimy więc otaczać go klauzulą try/catch
        user.setName ("Janek");
        //ale już metoda setEmail musi być zabezpieczona:
        try {
            user.setEmail ("janek.com");
        } catch (BadEmailException ex) {
            System.out.println ("Wyjątek! Wiadomość: " + ex.getMessage ()); //obiekt wyjątku (ex) przetrzymuje wiadomość którą zostałą dodana w trakcie jego rzucania. często okazuje się to bardzo pomocne
        }

        //teraz użyjemy drugiego konstruktora - musimy otoczyć klauzulą try/catch tworzenie obiektu bo ten konstruktor wyrzuca wyjątek BadEmailException
        User user2 = null;
        try {
            user2 = new User ("Janek", "janek.com");
        } catch (Exception ex) { //możemy użyć klasy bazowej - wtedy złapalibyśmy też ewentualne inne wyjątki dziedziczące po klasie Exception
            System.out.println ("To już drugi wyjątek! Wiadomość: " + ex.getMessage ());
        }

        //zróbmy to jeszcze raz, ale użyjmy w końcu poprawnego adresu - wyjątek nie powinien zostać rzucony
        User user3 = null;
        try {
            user3 = new User ("Adam", "adam@example.com");
        } catch (BadEmailException ex) {
            System.out.println ("No nie! Trzeci wyjątek! Nie przesadzasz? Wiadomość: " + ex.getMessage ());
        }
    }
}
