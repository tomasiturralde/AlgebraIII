package Tp1;

/**
 * Ej 7 - Iterative & Recursive version
 *
 * Iterative & recursive implementation of Ej 7 subsections.
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */

public class Ej7 {

    /**
     * MCD
     *
     * The greatest common denominator between param a and param b.
     *
     * @param a first integer.
     * @param b second integer.
     * @return GCD between param a and param b.
     */

    public static int MCD(int a, int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    /**
     * MCD
     *
     * Recursive version of MCD().
     *
     * @param a first integer.
     * @param b second integer.
     * @return GCD between param a and param b.
     */

    public static int mcd(int a, int b){
        if(b == 0)
            return a;
        return mcd(b,a%b);
    }


    public static void main(String[] args) {
        System.out.println(MCD(123, 277)); //result = 1
        System.out.println(MCD(111, 201)); //result = 3
        System.out.println(MCD(14039, 1529)); //result = 139
    }
}
