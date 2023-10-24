public class Kata {

  public static Object[] removeEveryOther(Object[] arr) {
    Object newArr[] = new Object[(arr.length + 1) / 2];
    for(int i = 0; i < newArr.length; i++)
    {
      newArr[i] = arr[i * 2];
    }
    return newArr;
  }

  // 0 0  1 2   2 4   3 6   4 8

  public static void main(String[] args)
  {
    Object[] arr = {1, 3, 5, 7, 9};
    Object[] printedArray = removeEveryOther(arr);

    for(int i = 0; i < printedArray.length; i++)
      System.out.println(printedArray[i]);
  }
}
