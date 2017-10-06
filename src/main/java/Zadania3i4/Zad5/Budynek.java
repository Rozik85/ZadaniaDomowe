package Zadania3i4.Zad5;

public class Budynek {
    private double wysokość;
    private double szerokość;
    private double długość;

    public double powierzchnia(){
        return szerokość*długość;
    }

    public Budynek(double wysokość, double szerokość, double długość) {
        this.wysokość = wysokość;
        this.szerokość = szerokość;
        this.długość = długość;
    }

}
