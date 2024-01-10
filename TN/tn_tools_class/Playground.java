public class Playground {
    public static void main(String[] args) {
        int [] tab = Tools.createRandomArr();
        int [] tab2 = Tools.createRandomArr(10);

        int [][] twodArr = Tools.create2DArr();
        Tools.fill2DArr(twodArr);

        int [][] twodArr2 = Tools.create2DArr(2); //2 rows
        Tools.fill2DArr(twodArr2);

        System.out.println("First tab:");
        Tools.showTab(tab);
        System.out.println();

        System.out.println("Second tab: ");
        Tools.showTab(tab2);
        System.out.println();

        System.out.println("First 2D tab: ");
        Tools.show2DTab(twodArr);
        System.out.println();

        System.out.println("Second 2D tab: ");
        Tools.show2DTab(twodArr2);

        


    }
}
