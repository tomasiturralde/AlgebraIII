package Tp2;

/**
 * Ej 12
 *
 * Implementation of the exercises 8-11 in code
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */
public class Ej12 implements Practice2{

    /**
     *
     * @param m Lower bound.
     * @param n Upper bound.
     * @return the summation of the numbers between m and n.
     */
    public long exercise8(int m, int n) {
        if (m > n)
            throw new RuntimeException("Condition: m <= n");

        long result = 0;
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
    public long exercise9(int m, int n, int r, int s){
        if (m > n || r > s)
            throw new RuntimeException("Conditions: m <= n & r <= s");
        long result = 0;
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
    public long exercise10(int n){
        if(n == 1)
            return 2;
        return (long) (n*Math.pow(2, n) + exercise10(n - 1));
    }

    /**
     *
     * @param n Upper bound in the summation.
     * @param x Variable to be evaluated in the summation.
     * @return the result of the summation between 0 and n of n*(x^n).
     */
    public double exercise11Sumation(int n, int x){
        if (n == 1)
            return x;
        return (n*Math.pow(x, n) + exercise11Sumation(n - 1, x));
    }

    /**
     *
     * @param n Coefficient used in the formula.
     * @param x Variable to be evaluated in the formula.
     * @return the result of the formula which should be equal to the result of the summation coded before this method.
     */
    public double exercise11Formula(int n, int x){
        return ((n*Math.pow(x, n+2) - (n+1)*Math.pow(x, n+1) + x)/Math.pow(x-1,2));
    }

    /**
     *
     * @param n Coefficient used in the formula and the upper bound in the summation.
     * @param x Variable used in the formula and the summation.
     * @return if the result of the summation and the result of the formula are the same, this method should return true.
     */
    public boolean ej11(int n, int x){
        return exercise11Sumation(n,x) == exercise11Formula(n,x);
    }
}
