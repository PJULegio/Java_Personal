import java.util.Scanner;

public class EuclidsAlgorithm
{
    public static void main(String[] args)
    {
        Scanner getNumber = new Scanner(System.in);
        int a = 48, b = 18;

        System.out.println("Podaj liczbę " + "a: ");
        a = getNumber.nextInt();
        System.out.println("Podaj liczbę " + "b: ");
        b = getNumber.nextInt();

        if (a > 0 && b > 0)
        {
            while (a != b)
            {
                if (a > b)
                    a -= b;
                else
                    b -= a;
            }
            System.out.println("Największy wspólny dzielnik:\n" + a);
        }
    }
}
