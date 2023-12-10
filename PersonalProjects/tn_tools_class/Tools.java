public class Tools {

    //print array
    public static void showTab(int [] tab){
        System.out.print("[ ");
        for(int i : tab){
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    // print 2D array
    public static void show2DTab(int[][] twoDTab){

        for(int i = 0; i <  twoDTab.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < twoDTab[i].length; j++){
                System.out.print(twoDTab[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    // Method overloading 

    //create n(random) element array filled with random values
    public static int [] createRandomArr(){
        int seed = (int) (Math.random() * 9) + 1;
        int [] arr = new int[seed];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }

        return arr;
    }

    // create n(size) element array filled with random values
    public static int [] createRandomArr(int size){
        int [] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }

        return arr;
    }

    // method overloading

    // create random 2D array
    public static int[][] create2DArr(){

        int randX = (int)(Math.random() * 10) + 1;
        int randY = (int)(Math.random() * 10) + 1;

        int [][] twoDTab = new int[randX][randY];

        return twoDTab;
    }

    // create random 2D array but choose hom many rows you want
    public static int [][] create2DArr(int rowNumber){

        int randY = (int)(Math.random() * 10) + 1;

        int [][] twoDTab = new int[rowNumber][randY];

        return twoDTab;
    }

    // method overloading
    // fill 2D array with random numbers
    public static int [][] fill2DArr(int [][]twoDArr){

        for(int i = 0; i < twoDArr.length; i++){
                for(int j = 0; j < twoDArr[i].length; j++){

                    twoDArr[i][j] = (int)(Math.random() * 100); 
                }
            }
        return twoDArr;
    }

    public static int [][] fill2DArr(int [][]twoDArr, int size){

        for(int i = 0; i < twoDArr.length; i++){
                for(int j = 0; j < twoDArr[i].length; j++){

                    twoDArr[i][j] = (int)(Math.random() * size); 
                }
            }
        return twoDArr;
    }

    public static int numberOfElementsIn2D(int [][] twoDArr){
        int count = 0;

        for(int i = 0; i < twoDArr.length; i++){
                for(int j = 0; j < twoDArr[i].length; j++){
                    count++;
                }
            }
        return count;
    }
}
