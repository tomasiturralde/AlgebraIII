package Tp2;

/**
 * Ej 12
 *
 * Implementation of the exercises 8-11 in code
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */
public class Ej12 {

    /**
     *
     * @param m Lower bound.
     * @param n Upper bound.
     * @return the summation of the numbers between m and n.
     */
    public static int ej8(int m, int n) {
        if (m > n)
            throw new RuntimeException("Condition: m <= n");

        int result = 0;
        for (int j = m; j <= n; j++)
            result += j;
        return result;
    }

    /**
     *
     * @param m Lower bound of first summation.
     * @param n Upper bound of first summation.
     * @param r Lower bound of second summation.
     * @param s Upper bound of second summation.
     * @return the summation of j*k (j in between m and n & k in between r and s).
     */
    public static int ej9(int m, int n, int r, int s){
        if (m > n || r > s)
            throw new RuntimeException("Conditions: m <= n & r <= s");
        int result = 0;
        for (int j = m; j <= n; j++) {
            for (int k = r; k <= s; k++){
                result += j*k;
            }
        }
        return result;
    }

    /**
     *
     * @param n maximum exponential and coefficient of the multiplication.
     * @return the summation between 0 and n of n*(2^n).
     */
    public static double ej10(int n){
        if(n == 1)
            return 2;
        return n*Math.pow(2, n) + ej10(n - 1);
    }

    private static double ej11PartA(int n, int x){
        if (n == 1)
            return x;
        return n*Math.pow(x, n) + ej11PartA(n - 1, x);
    }

    private static double ej11PartB(int n, int x){
        return ((n*Math.pow(x, n+2) - (n+1)*Math.pow(x, n+1) + x)/Math.pow(x-1,2));
    }

    public static boolean ej11(int n, int x){
        return ej11PartA(n,x) == ej11PartB(n,x);
    }
}
