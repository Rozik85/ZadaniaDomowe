package Zadania5i6.Zad4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String napis = "ala ma kota ala ma czajnik\tale\nnie ma gwizdka ma też drugiego kota";
        //Set<String> zbiorSlow = new HashSet<>(Arrays.asList(napis.split("\\s")));
        String [] napisyTablica = napis.split("\\s");
        List<String> napisyLista = Arrays.asList(napisyTablica);
        System.out.println("Napisy lista: " + napisyLista);
        Set<String> zbiorSlow = new HashSet<> (napisyLista);
        System.out.println("Napisy zbior: " + zbiorSlow);

    }
}

