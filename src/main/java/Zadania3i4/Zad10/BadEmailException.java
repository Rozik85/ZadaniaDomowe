package Zadania3i4.Zad10;

public class BadEmailException extends Exception {
    public BadEmailException(String message) { //chcemy przekazać razem z wyjątkiem jakąś informację dla obsługującego wyjątek, dlatego definiujemy własny konstruktor, w którym wywołujemy odpowiedni konstruktor klasy bazowej
        super (message);
    }

}
