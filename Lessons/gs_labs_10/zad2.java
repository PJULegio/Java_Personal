public class zad2
{
    public static void main(String[] args)
    {
        int tabX = (int)(Math.random() * 10) + 1,
        tabY = (int)(Math.random() * 10);
        int[][] tab = new int[tabY][tabX];
        int[][] supportTab = new int[tabY][tabX];
        int[][] newTab = new int[tabY][tabX];

        // Fill table
        for(int i = 0; i < tabY; i++)
        {
            for(int j = 0; j < tabX; j++)
            {
                tab[i][j] = (int)(Math.random() * 10);
            }
        }

        printTable(tab);

        // Look for repeating elements
        for(int i = 0; i < tabY; i++)
        {
            for(int j = 0; j < tabX; j++)
            {
                for(int n = j + 1; n < tabX; n++)
                {
                    while(tab[i][j] == tab[i][n])
                    {
                        supportTab[i][n] = -1;
                    }
                    else
                        supportTab[i][j] = tab[i][j];
                }
            }
        }

        printTable(supportTab);
    }

    public static void printTable(int[][] e)
    {
        for(int i = 0; i < e.length; i++)
        {
            for(int j = 0; j < e[i].length; j++)
            {
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------");
    }
}