public class EuclideanAlgorithm {
    public static int greatDivisor(int a, int b){
        if(a > 0 && b > 0){
            while(a != b){
                if(a > b){
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        }else{
            return 0;
        }

    }
}
