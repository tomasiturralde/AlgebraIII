package Tp1;

import java.util.ArrayList;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 19/03/2017.
 */
public class Ej6 {

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

    private boolean recursiveIsPrime(int n, int floor, int limit){
        if (n % floor == 0 && n != floor){
            return false;
        } else if ( floor > n){
            return true;
        }

        floor++;

        return recursiveIsPrime(n, floor, limit);
    }

    public int firstBiggerPrime(int n){

        while (!isPrime(n)){
            n = n + 1;
        }

        return n;
    }

    public int recursiveBiggerPrime(int n){
        if(isPrime(n)) return n;
        return recursiveBiggerPrime(++n);
    }

    public int numberOfPrimeFactors(int n){
        return primeFactors(n).size();
    }

    public  ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public ArrayList<Integer> recursivePrimeFactors(int n){

        return recursivePrimeFactors(n,1,new ArrayList<>());
    }

    private ArrayList<Integer> recursivePrimeFactors(int n, int i, ArrayList<Integer> factors) {
        if(n < i) {
            return factors;
        } else if(n % i == 0 && isPrime(i)){
            factors.add(i);
            return recursivePrimeFactors(n/i, i+i, factors);
        } else {
            return recursivePrimeFactors(n, i+1, factors);
        }

    }
}
