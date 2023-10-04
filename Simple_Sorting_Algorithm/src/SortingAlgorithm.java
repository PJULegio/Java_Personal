import java.util.Arrays;

public class SortingAlgorithm {
    public static int findMax(int[] liczby) {
        int max = liczby[0];
        for (int i = 1; i < liczby.length; i++) {
            if (max < liczby[i]) {
                max = liczby[i];
            }
        }
        return max;
    }

    public static int findMin(int[] liczby) {
        int min = liczby[0];
        for (int i = 1; i < liczby.length; i++) {
            if (min > liczby[i]) {
                min = liczby[i];
            }
        }
        return min;
    }

    public static int giveMaxPos(int[] liczby) {
        int posmax = 0;
        for (int i = 1; i < liczby.length; i++) {
            if (liczby[posmax] < liczby[i]) {
                posmax = i;
            }
        }
        return posmax;
    }

    public static int giveMinPos(int[] liczby, int x) {
        int posmin = 0;
        for (int i = 1; i < liczby.length - x; i++) {
            if (liczby[posmin] > liczby[i]) {
                posmin = i;
            }
        }
        return posmin;
    }

    public static String simpleSort(int[] liczby) {
        int leng = 0;

        for (int i = 0; i < liczby.length; i++) {
            swapPos(liczby, giveMinPos(liczby, leng), liczby.length - 1 - leng);
            leng++;
        }
        return Arrays.toString(liczby);
    }

    public static void swapPos(int[] liczby, int oldPos, int newPos) {

        int temp = liczby[oldPos];
        liczby[oldPos] = liczby[newPos];
        liczby[newPos] = temp;
    }
}
