package Zad5;

public class Main {
    public static void main(String[] args)
    {
        Prostokat prostokat = new Prostokat(3, 4);
        System.out.println(prostokat.pole());

        Prostokat prostokatDomyslny = new Prostokat();
        System.out.println(prostokatDomyslny.pole());

        Prostopadloscian prostopadloscian = new Prostopadloscian(5);
        System.out.println(prostopadloscian.poleP());
        System.out.println(prostopadloscian.objetoscP());
        System.out.println(prostopadloscian.pole());
    }
}
