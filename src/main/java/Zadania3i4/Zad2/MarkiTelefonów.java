package Zadania3i4.Zad2;

public enum MarkiTelefonów {
    NOKIA(1),
    SONY(2),
    LG(2),
    IPHONE(3),
    SAMSUNG(3);

    private final int popularnosc;

    MarkiTelefonów(int popularonosc) {
        this.popularnosc = popularonosc;
    }

    public int getPopularnosc() {
        return popularnosc;
    }
}

