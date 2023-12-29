package Zad5;

public class Prostokat {
    private int dlugosc;
    private int szerokosc;

    Prostokat(int a, int b)
    {
        this.dlugosc = a;
        this.szerokosc = b;
    }

    Prostokat()
    {
        this(5, 6);
    }

    public double pole()
    {
        return this.dlugosc * this.szerokosc;
    }

    public int getDlugosc()
    {
        return this.dlugosc;
    }

    public int getSzerokosc()
    {
        return this.szerokosc;
    }
}
