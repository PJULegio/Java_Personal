public class Kata {
    public static void main(String[] args)
    {
        int arr[] = digitize(2147483689001l);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] digitize(long n) {
        int nLength = 1;
        if (n > 0)
            nLength = (int)(Math.log10(n) + 1);

        int arr[] = new int[nLength];
        
        for (int i = 1; i <= nLength; i++)
        {
            arr[i - 1] = (int)(n % 10);
            n = n / 10;
        }
        return arr;
    }
}