public class Rysunek
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if(j == 3)
					System.out.print("-");
				else if(j == i)
					System.out.print("X");
				else
					System.out.print("o");
			}
			System.out.println("");
		}
	}
}