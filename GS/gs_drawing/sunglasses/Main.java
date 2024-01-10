public class Main
{
	public static void main(String[] args)
	{
		int n = 7; // 3 <= n <= 100
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n*5; j++)
			{
				if(j >= n * 2 && j < n * 3)
				{
					if((n % 2 == 0 && i == n / 2 - 1) || (n % 2 == 1 && i == n / 2))
						System.out.print("|");
					else
						System.out.print(" ");
				}
				else if(j < n * 2 || j >= n * 3)
				{
					if(i == 0 || i == n - 1)
						System.out.print("*");
					else if(j == 0 || j == n*2-1 || j== n*3 || j == n*5-1)
						System.out.print("*");
					else
						System.out.print("/");
				}
			}
			System.out.println();
		}
	}
}