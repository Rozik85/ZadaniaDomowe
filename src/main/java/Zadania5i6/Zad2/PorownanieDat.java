package Zadania5i6.Zad2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 2. (Poziom 2) Wczytaj od użytkownika dwie daty i wyświetl która jest wcześniejsza.
 *
 */
public class PorownanieDat {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        System.out.println ("podaj 1 datę");
        Scanner scanner = new Scanner(System.in);
        String data1 = scanner.nextLine ();
        System.out.println ("podaj drugą datę");
        String data2  = scanner.nextLine ();
LocalDate lData1  = LocalDate.parse (data1, dateTimeFormatter);
LocalDate lData2 = LocalDate.parse (data2, dateTimeFormatter);

if (lData1.isBefore (lData2)){
    System.out.println ("Data " + lData1+" jest wcześcniejsza od "+lData2);
}
else if(lData1.isAfter (lData2)){
    System.out.println ("Data " + lData2+" jest wcześcniejsza od "+lData1);
}
else{
    System.out.println ("Data "+lData1+" jest taka sama jak data "+lData2);
}
    }
}
