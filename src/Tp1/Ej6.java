package Tp1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Ej 8 - Iterative & Recursive version
 *
 * Iterative & recursive implementation of Ej 6 subsections.
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */

public class Ej6 {

    /**
     * isPrime
     *
     * Evaluates if a number is a prime or not.
     *
     * @param n natural integer
     * @return true/false if param n is a prime number.
     */

    public boolean isPrime(Integer n){

        boolean answer = true;

        if (n == 2 || n == 3){
            return  true;
        }

        try{
            if(n < 0 || n ==1) throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println("n must be > 0 or != 1!");
        }

        Double dLimit = Math.floor(Math.sqrt(n));
        Integer limit =  dLimit.intValue();

        for(int i = 2; i <= limit; i++){
            if (n % i == 0){
                answer = false;
                break;
            }
        }

        return answer;
    }

    /**
     * recursiveIsPrime
     *
     * public caller for recurisve version of isPrime().
     *
     * @param n natural integer.
     * @return true/false if param n is a prime number.
     */

    public boolean recursiveIsPrime(int n) {
        boolean answer = true;

        if (n == 2 || n == 3){
            return  true;
        }

        try{
            if(n < 0 || n ==1) throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println("n must be > 0 or != 1!");
        }

        Double dLimit = Math.floor(Math.sqrt(n));
        Integer limit =  dLimit.intValue();

        answer = recursiveIsPrime(n, 2, limit);

        return answer;
    }

    /**
     * isPrime
     *
     * Recursive version of isPrime().
     *
     * @param n natural integer.
     * @param floor where to start counting from.
     * @param limit square root of param n. Prevents algorithm from testing multiples.
     * @return true/false if param n is a prime number.
     */

    private boolean recursiveIsPrime(int n, int floor, int limit){
        if (n % floor == 0 && n != floor){
            return false;
        } else if ( floor > n){
            return true;
        }

        floor++;

        return recursiveIsPrime(n, floor, limit);
    }

    /**
     * firstBiggerPrime
     *
     * Calculates the closest prime number to the natural number passed.
     *
     * @param n integer to look for.
     * @return the closest prime number to param n.
     */

    public int firstBiggerPrime(int n){

        while (!isPrime(n)){
            n = n + 1;
        }

        return n;
    }

    /**
     * recursiveBiggerPrime
     *
     * public caller for recursiveBiggerPrime().
     *
     * @param n integer to look for.
     * @return the closest prime number to param n.
     */

    public int recursiveBiggerPrime(int n){
        if(isPrime(n)) return n;
        return recursiveBiggerPrime(++n);
    }

    /**
     * numberOfPrimeFactors
     *
     * Calculates the prime factors of a number and counts how much there are.
     *
     * @param n integer to evaluate.
     * @return number of prime factors param n has.
     */

    public int numberOfPrimeFactors(int n){
        return primeFactors(n).size();
    }

    /**
     * primeFactors
     *
     * Decomposes param n into prime factors
     *
     * @param n integer to decompose.
     * @return an array list containing the prime factors of n.
     */

    public  Set<Integer> primeFactors(int n) {
        Set<Integer> factors = new HashSet<>();

        factors.add(1);

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }
        return factors;
    }

    /**
     * recursivePrimeFactors
     *
     * public caller for recursivePrimeFactors().
     *
     * @param n integer to decompose.
     * @return an array list containing the prime factors of n.
     */

    public Set<Integer> recursivePrimeFactors(int n){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        return recursivePrimeFactors(n,2, set);
    }

    /**
     * recursivePrimeFactors
     *
     * public caller for recursivePrimeFactors().
     *
     * @param n integer to decompose.
     * @param i following integer to test as a prime factor.
     * @param factors list of prime factors of param n.
     * @return a set containing the prime factors of n.
     */

    private Set<Integer> recursivePrimeFactors(int n, int i, Set<Integer> factors) {
        if(n < i) {
            return factors;
        } else if(n % i == 0 && isPrime(i)){
            factors.add(i);
            return recursivePrimeFactors(n/i, i+1, factors);
        } else {
            return recursivePrimeFactors(n, i+1, factors);
        }

    }
}
