package Zad5;

public class Prostopadloscian extends Prostokat {
    private int wysokosc;

    Prostopadloscian(int c)
    {
        this.wysokosc = c;
    }

    public double poleP()
    {
        return (2*this.wysokosc*this.getDlugosc()) +
               (2*this.wysokosc*this.getSzerokosc()) +
               (2*this.pole());
    }
    public double objetoscP()
    {
        return this.wysokosc * this.pole();
    }
}
