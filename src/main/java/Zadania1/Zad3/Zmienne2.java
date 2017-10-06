package Zadania1.Zad3;

/*
 *
 * 3. Napisz program, w którym dodasz funkcję (metodę) realizującą dodawanie, odejmowanie, mnożenie i dzielenie, a także modulo na typie całkowitym int.
 * 3.a Napisz program, który zrealizuje wyżej wymienione metody, ale będzie można go użyć w np. taki sposób: liczba.plus(3).minus(4).multiple(2).divide(5).
 * Tip: zdefiniuj odpowiednią klasę.
 */
public class Zmienne2 {
    public static void main(String[] args) {

        char aChar = 'z';
        byte aByte = 127;
        short aShort = 1000;
        int aInt = 2000;
        long aLong = 100000000L;
        double aDouble = 23.459;
        float aFloat = 49.20f;
        boolean tBoolean = true;
        boolean fBoolean = false;

        System.out.println(aChar+" "+aByte+" "+aShort+" "+aInt+" "+aLong+" "+aDouble+" "+aFloat);
        System.out.println(tBoolean);
        System.out.println(fBoolean);

        int a=2;
        int b=3;
        int c;
        double d;
        System.out.println(c=b+a);
        System.out.println(d=aFloat-aDouble);
        System.out.println(aLong==aInt);


        System.out.println(dodwanie(5,3));
        System.out.println(odejmowanie(5,3));
        System.out.println(mnożenie(5,3));
        System.out.println(dzielenie(5,3));
        System.out.println(modulo(5,3));
    }
    public static int dodwanie (int a ,int b){
        return a+b;
    }
    public static int odejmowanie(int a, int b){
        return a-b;
    }
    public static int mnożenie (int a, int b){
        return a*b;
    }
    public static int dzielenie (int a, int b){
        return a/b;
    }
    public static int modulo(int a, int b){
        return a%b;
    }
}
