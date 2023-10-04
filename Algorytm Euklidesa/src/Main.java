import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = myScan.nextInt();

        System.out.println("Podaj drugą liczbę");
        int b = myScan.nextInt();

        System.out.println("Największy dzielnik to: " + EuclideanAlgorithm.greatDivisor(a,b));
    }
}

