package Zadania5i6.Zad3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 3. (Poziom 2) Wczytaj od użytkownika datę i godzinę, wyświetl na ekranie jaka jest teraz data i godzina w Los Angeles i Tokio.
 */
public class DatyZaGranicą {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern ("dd/MM/yyyy HH:mm");
        System.out.println ("podaj swoją datę i godzinę");
        Scanner scanner = new Scanner (System.in);
        String mojaData = scanner.nextLine ();
        LocalDateTime aktulnaMojaDataGodzina = LocalDateTime.parse (mojaData, dateTimeFormatter);

        System.out.println ("Mój czas "+aktulnaMojaDataGodzina);
        ZonedDateTime paris = aktulnaMojaDataGodzina.atZone (ZoneId.of ("Europe/Paris"));
        ZonedDateTime tokyo = aktulnaMojaDataGodzina.atZone (ZoneId.of ("Asia/Tokyo"));
        System.out.println ("Czas w Paryży: "+paris);
        System.out.println ("Czas w Tokyo: "+ tokyo);


}}
