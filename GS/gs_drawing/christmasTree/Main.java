public class Main
{
public static void main(String[] args)
{
	int n = 7; // 1 <= n <= 100
	for(int i = 0; i <= n; i++)
	{
		for(int j = 0; j < n * 2 + 3; j++)
		{
			if(j == n + 1)
				System.out.print("|");
			else if (j == n || j == n + 2)
				System.out.print(" ");
			else if (j < n - i || (j < 2 * n + 3 && j > n + 2 + i))
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println();
	}
}
}