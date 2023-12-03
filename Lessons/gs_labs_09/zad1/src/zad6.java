public class zad6 {
    public static void main(String[] args) {
        int n = 20;
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        fill(A);
        fill(B);

        for(int i : A) System.out.println(i);
        System.out.println("---------");
        for(int i : B) System.out.println(i);
        System.out.println("---------");

        sort(A, true);
        sort(B, false);

        for(int i : A) System.out.println(i);
        System.out.println("---------");
        for(int i : B) System.out.println(i);
        System.out.println("---------");
    }

    public static void fill(int[] tablica)
    {
        for( int i = 0; i < tablica.length; i++ )
        {
            tablica[i] = (int)(Math.random() * 21);
        }
    }

    public static void sort(int[] tablica, boolean asc)
    {
            for (int i = 0; i < tablica.length; i++) {
                for (int j = i; j < tablica.length; j++) {
                    if (tablica[j] < tablica[i] && asc) { // do poprawy
                        int temp = tablica[i];
                        tablica[i] = tablica[j];
                        tablica[j] = temp;
                    }
                    else if(tablica[j] > tablica[i])
                    {
                        int temp = tablica[i];
                        tablica[i] = tablica[j];
                        tablica[j] = temp;
                    }
                }
            }
    }

}
