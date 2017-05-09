package Tp1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 19/03/2017.
 */
public class Ej6Test {

    Ej6 ej6 = new Ej6();
    int[] primes = {2,3,5,7,11,13,17,19};
    int[] notPrimes = {4,6,8,9,10,12,14,15,16};

    @Test
    public void isPrime() throws Exception {
        for (int e : primes){
            assertEquals(true,ej6.isPrime(e));
        }

        for (int e : notPrimes){
            assertEquals(false,ej6.isPrime(e));
        }
    }

    @Test
    public void recursiveIsPrime() throws Exception {


        for (int e : primes){
            assertEquals(true,ej6.recursiveIsPrime(e));
        }

        for (int e : notPrimes){
            assertEquals(false,ej6.recursiveIsPrime(e));
        }
    }

    @Test
    public void firstBiggerPrime() throws Exception {
        assertEquals(11,ej6.firstBiggerPrime(8));
        assertEquals(11,ej6.firstBiggerPrime(11));
    }

    @Test
    public void recursiveBiggerPrime() throws Exception {
        assertEquals(11,ej6.recursiveBiggerPrime(8));
        assertEquals(11,ej6.recursiveBiggerPrime(11));
    }

    @Test
    public void numberOfPrimeFactors() throws Exception {
        assertEquals(2,ej6.numberOfPrimeFactors(15));
        assertEquals(1,ej6.numberOfPrimeFactors(8));
    }

    @Test
    public void getPrimeFactors() throws  Exception {
        System.out.println(ej6.primeFactors(15).toString());
        System.out.println(ej6.primeFactors(8).toString());
    }

    @Test
    public void recursivePrimeFactors() throws Exception {
        System.out.println(ej6.recursivePrimeFactors(15).toString());
        System.out.println(ej6.recursivePrimeFactors(8).toString());
    }
}