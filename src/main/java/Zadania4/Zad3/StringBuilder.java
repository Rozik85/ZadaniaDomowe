package Zadania4.Zad3;

import Zadania4.Zad1.User;

import java.util.Scanner;

/**
 * 3. Utwórz String "Ala ma kota"
 * używając StringBuildera i metody append.
 */
public class StringBuilder {
    public static void main(String[] args) {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder ();
    stringBuilder.append ("Ala");
    stringBuilder.append (" ma");
    stringBuilder.append (" kota.");
        System.out.println (stringBuilder);
}}

