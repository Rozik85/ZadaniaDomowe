package Zadania4.Zad1;

import Zadania3i4.Zad10.BadEmailException;

import java.util.Scanner;

public class User {
    private String name;
    private String email;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", scanner=" + scanner +
                '}';
    }

    Scanner scanner = new Scanner (System.in);

    public void setName() {
        System.out.println ("Podaj Imię");
        name = scanner.nextLine ();
    }

    public void setEmail() {
    System.out.println ("Podaj email");
    email = scanner.nextLine ();

    }
}
