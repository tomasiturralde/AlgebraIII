package Tp1;

/**
 * Created by Tomas on 19/3/2017.
 */
public class Ej1Recursive {

    public int a(int n){
        if (n == 0)
            return 0;
        return n + a(n - 1);
    }

    public static double b(int n){
        if (n == 0)
            return 0;
        return Math.pow(n,2) + b(n - 1);
    }

    public static double c(int p, int n){
        if (n == 0)
            return 1;
        return Math.pow(p, n) + c(p,n-1);
    }

    public static int d(int n){
        if (n == 1)
            return 1;
        return (2*n-1) + d(n - 1);
    }

    public static int e(int n){
        if (n == 0)
            return 0;
        return n*(n + 1) + e(n - 1);
    }

    public static double f(int n){
        if (n == 0)
            return 0;
        return Math.pow(n,3) + f(n - 1);
    }
}
