package Zadania4.Zad11;

/**
 * 11. Zamień imię Ala na Tadek w napisie "Ala ma kota" (replace())
 */
public class StringZamiana {
    public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder ();
    String imię= "Ala";
    String imię2 = "Tadek";
    stringBuilder.append (imię);
    stringBuilder.append (" ma kota");
        System.out.println (stringBuilder);
        System.out.println (stringBuilder.replace (0,3,"Tadek"));
}}
