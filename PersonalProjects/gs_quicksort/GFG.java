// https://www.geeksforgeeks.org/quick-sort/
public class GFG
{
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                System.out.println(i + " " + j);  // DEBUG
                swap(arr, i, j);
            }
        }
        
        swap(arr, i + 1, high);
        return(i + 1);
    }

    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void printArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        int arr[] = { 10, 80, 30, 90, 40, 50, 70 };
        int N = arr.length;

        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}