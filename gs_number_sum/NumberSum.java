import java.util.Scanner;

public class NumberSum
{
    public static void main(String[] args)
    {
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = getNumber.nextInt();
        int sum = 0;

        while (number != 0)
        {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("Suma = " + sum);
    }
}
