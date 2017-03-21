package Tp1;

/**
 * Ej 2 - Recursive version
 *
 * Recursive implementation of Ej 2 subsections.
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */

public class Ej2Recursive {
    public static int factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        return n*factorial(n - 1);

    }

    public static double powOf2(int n){
        if (n == 0) {
            return 1;
        } else {
            return 2 * powOf2(n - 1);
        }
    }

    public static int fibonacci(int n){
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 2) + fibonacci(n - 1);

    }

    public static int mcd(int a, int b){

        if(b == 0){
            return a;
        }

        return mcd(b,a%b);
    }
}
