public class BubbleSort
{
    public static void main(String[] args)
    {
        //int Array[] = {4, 2, 5, 1, 7};
        int Array[] = {17, 51, 67, 3, 0, 14, 98, 11, 42, 70};
        int len = Array.length;
        int i, n, cache;
        for(i = 0; i < len; i++)
        {
            for(n = 0; n < len - 1; n++) // len - 1 because of Array[n+1]
            {
                if(Array[n] > Array[n+1])
                {
                    cache = Array[n+1];
                    Array[n+1] = Array[n];
                    Array[n] = cache;
                }
            }
        }

        // Print result
        for(i = 0; i < len; i++)
            System.out.println(Array[i]);
    }
}
