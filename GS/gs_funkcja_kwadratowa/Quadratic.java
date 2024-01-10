import java.util.Scanner;

public class Quadratic
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Podaj a:");
        short a = userInput.nextShort();

        System.out.println("Podaj b:");
        short b = userInput.nextShort();

        System.out.println("Podaj c:");
        short c = userInput.nextShort();

        if(a == 0)
        {
            if(b == 0)
                System.out.println(c == 0 ? "Zbiór liczb rzeczywistych" : "Zbiór pusty");

            else
                System.out.println("x = " + ((float)-c / b));
        }

        else
        {
            double delta = (Math.pow(b, 2.0d)) - (4*a*c);
            // System.out.println("Delta = " + delta);

            if(delta >= 0)
            {
                double sqrtDelta = Math.sqrt(delta);
                System.out.println(
                                "x1 = "   + ((-b - sqrtDelta) / (2*a)) +
                                "\nx2 = " + ((-b + sqrtDelta) / (2*a))
                                );
            }

            else
                System.out.println("Zbiór pusty");
        }
    }
}
