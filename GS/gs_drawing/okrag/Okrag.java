public class Okrag
{
public static void main(String[] args)
{
	for(int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 10; j++)
		{
			if(j == 4 - i || j == 5 + i)
				System.out.print("x");
			else if (j == 4 || j == 5)
				System.out.print("|");
			else
				System.out.print("-");
		}
		System.out.println("");
	}
	for(int i = 5; i < 10; i++)
	{
		for(int j = 0; j < 10; j++)
		{
			if( j == -5 + i || j == 14 - i)
				System.out.print("x");
			else if (j == 4 || j == 5)
				System.out.print("|");
			else
				System.out.print("-");
			
		}
		System.out.println("");
	}
}
}

/*

----**----
---*--*---
--*----*--
-*------*-
*--------*

*/