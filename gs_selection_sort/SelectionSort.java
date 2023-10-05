public class SelectionSort
{
    public static void main(String[] args)
    {
        byte[] numbers = {6, 9, 2, 5, -1, 0, 4, 5, 2, 4, 0, 17, 18, -4};
        byte len = (byte)numbers.length;
        byte cache, min, i, j;

        // Selection sort
        for (i = 0; i < len; i++)
        {
            min = i;

            for (j = i; j < len; j++)
                if (numbers[j] < numbers[min])
                    min = j;

            cache = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = cache;
        }

        // Print the sorted array
        for (i = 0; i < len; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
