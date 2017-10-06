package Zadania1i2.Zad12;

/**
 * 12. (Poziom 1) Napisz metodę przyjmującą zmienną ilość argumentów typu całkowitego. Metoda powinna zwracać sumę podanych argumentów.
 */
public class Main {
    public int suma (int arg0, int...args) {
int wynik = arg0;
        for (int i = 0; i<args.length; i++) {
            wynik +=args[i];
        }
        return wynik;
    }

    public static void main(String[] args) {
        Main main = new Main ();
        main.suma (2,6,7,8,9);
        System.out.println (main.suma (2, 6,7,8,9));
    }
}
