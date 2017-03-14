package Tp1;

/**
 * Created by Tomas on 13/3/2017.
 */
public class Ej2 {
    public static int factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return n*factorial(n - 1);

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
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static int mcd(int a, int b){

        if(b == 0){
            return a;
        }

        return mcd(b,a%b);
    }
}
