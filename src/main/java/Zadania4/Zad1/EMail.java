package Zadania4.Zad1;

import Zadania3i4.Zad10.BadEmailException;

public class EMail {
    /**
     * 1. Utwórz klasę User z polem String email. Dodaj do niej metodę setEmail, która w trakcie działania wyrzuca wyjątek BadEmailException,
     * kiedy w podanym napisie nie znajdzie się znak '@'
     */

    public static void main(String[] args) throws Exception {
        User user1 = new User ();
        user1.setName ();
      //  try{
        user1.setEmail ();
//        catch (BadEmailException e){
//            System.out.println ("Zły email");
//        }
        System.out.println (user1);
    }
}

