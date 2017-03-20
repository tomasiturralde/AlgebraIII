package Tp1;

/**
 * Created by Tomas on 19/3/2017.
 */
public class Ej2Iterative {

    public static int factorial(int n){
        int result = 1;
        if (n == 0 || n == 1)
            return 1;
        for (int i = n; i > 0; i--){
            result = result*i;
        }

        return result;
    }

    public static double powOf2(int n){

        int pow = 2;

        if(n == 0) return 1;

        for (int i = 1; i < n; i++){
            pow = 2*pow;
        }

        return pow;
    }

    public static int fibonacci(int n){
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    public static int mcd(int a, int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
