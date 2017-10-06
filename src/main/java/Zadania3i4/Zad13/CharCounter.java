package Zadania3i4.Zad13;

public class CharCounter {
    public int liczbaWystąpieńZnaku(String znak, String zdanie){
        int ilośćWystąpieńZnaku=0;

        for (int i = 0; i<zdanie.length (); i++) {
            boolean znajdujeSię = zdanie.substring (i,i+1).contentEquals(znak);
            if(znajdujeSię==true){
                ilośćWystąpieńZnaku++;
            }
        }
        return ilośćWystąpieńZnaku;

    }
}
