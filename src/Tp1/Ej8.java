package Tp1;

/**
 * Ej 8 - Iterative & Recursive version
 *
 * Iterative & recursive implementation of Ej 8 subsections.
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */

public class Ej8 {

    /**
     * horner
     *
     * Efficiently evaluates a polynomial.
     *
     * @param poly coefficients
     * @param n the polynomial's degree.
     * @param x value to be evaluated in the polynomial.
     * @return the polynomial tested in param x.
     */

    public static int horner(int[]poly, int n, int x){
        int result = poly[0];
        for (int i=1; i <= n; i++)
            result = result*x + poly[i];

        return result;
    }

    /**
     * hornerRecursive
     *
     * Recursive version of horner().
     *
     * @param poly coefficients
     * @param n the polynomial's degree.
     * @param x value to be evaluated in the polynomial.
     * @return the polynomial tested in param x.
     */

    public static int hornerRecursive(int[]poly, int n, int x){
        if (n == 0)
            return poly[0];
        return hornerRecursive(poly, n-1, x) * x + poly[n];

    }

    /*
    En el ejemplo dado:
    hacer 10*(x^3)+5*(x^2)+8*x+1 lleva a realizar 9 operaciones(6 multiplicaciones y 3 sumas)
    Mientras que si se aplica la regla de horner y se utiliza:
    ((10*x+5)*x+8)*x+1 se realizan 6 operaciones(3 multiplicaciones y 3 sumas)
     */
}