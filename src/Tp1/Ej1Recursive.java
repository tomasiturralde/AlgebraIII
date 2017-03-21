package Tp1;

/**
 * Ej 1 - Recursive version
 *
 * Each subsection is named as a method. Method (a) corresponds to Ej 1.a subsection, method (b) to Ej 1.b, an so on.
 * This is the recursive version of methods implemented in Ej1Iterative.
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */

public class Ej1Recursive {

    public int a(int n){
        if (n == 0)
            return 0;
        return n + a(n - 1);
    }

    public  double b(int n){
        if (n == 0)
            return 0;
        return Math.pow(n,2) + b(n - 1);
    }

    public  double c(int p, int n){
        if (n == 0)
            return 1;
        return Math.pow(p, n) + c(p,n-1);
    }

    public  int d(int n){
        if (n == 1)
            return 1;
        return (2*n-1) + d(n - 1);
    }

    public  int e(int n){
        if (n == 0)
            return 0;
        return n*(n + 1) + e(n - 1);
    }

    public  double f(int n){
        if (n == 0)
            return 0;
        return Math.pow(n,3) + f(n - 1);
    }
}
