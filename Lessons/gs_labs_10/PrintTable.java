public class PrintTable
{
    public static void print1D(int tab[])
    {
        for(int i = 0; i < tab.length; i++)
        {
            System.out.print(tab[i] + " ");
        }

        System.out.println("\n----------");
    }

    public static void print2D(int tab[][])
    {
        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
                System.out.print(tab[i][j] + " ");

            System.out.println();
        }

        System.out.println("-----------");
    }
}