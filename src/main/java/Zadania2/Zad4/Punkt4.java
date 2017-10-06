package Zadania2.Zad4;

public class Punkt4 {
   private double x;
   private double y;

    public Punkt4(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punkt4{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static double averagePointX (Punkt4... punkt) {
        double wynikX = 0.0;
        int licznik=0;

        for (int i = 0; i < punkt.length; i++) {
             wynikX += punkt[i].getX();
             licznik++;
        }
        double sredniaX = wynikX/licznik;
        return sredniaX;
    }

    public static double averagePointY (Punkt4... punkt) {
        double wynikY = 0.0;
        int licznikY = 0;

        for (int i = 0; i < punkt.length; i++) {
            wynikY += punkt[i].getY();
            licznikY++;
        }
        double sredniaY = wynikY/licznikY;
        return sredniaY;
    }
}
