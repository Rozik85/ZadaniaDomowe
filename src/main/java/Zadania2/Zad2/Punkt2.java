package Zadania2.Zad2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punkt2 {
    double x;
    double y;

    public Punkt2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static double distance (Punkt2 punkt2, Punkt2 punkt21){
        return sqrt(pow((punkt2.getX()- punkt21.getX()),2) +(pow((punkt2.getY()- punkt21.getY()),2)));
    }
}
