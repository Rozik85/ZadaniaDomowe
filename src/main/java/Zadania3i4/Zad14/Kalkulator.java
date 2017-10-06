package Zadania3i4.Zad14;

/**
 * 14. (Poziom 2) Utwórz nowy projekt Maven. Dodaj klasę Kalkulator oraz metody dodaj i odejmij, przyjmującej dwie wartości int i zwracające wartość int
 * (np. public int dodaj(int liczba1, int liczba2) ). Utwórz test (Ctrl+Shift+T) - wybierz JUnit 4 jako framework, zaznacz metodę @Before(setUp)
 * oraz metody, dla których test chcesz utworzyć (czyli dodaj() i odejmij()). Przetestuj metody dla kilku zestawów danych testowych.
 * Do głównego pliku konfiguracyjnego Mavena należy dodać odpowiednią zależność dla JUnit - przykład znajdziesz na dropboksie w projekcie maven_test.
 */
public class Kalkulator {
    public int dodawanie(int liczbaPierwsza, int liczbaDruga) {
        return liczbaPierwsza + liczbaDruga;
    }

    public int odejmowanie(int liczbaPierwsza, int liczbaDruga) {
        return liczbaPierwsza - liczbaDruga;
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator ();
        System.out.println (kalkulator.dodawanie (5, 2));
    }
}
