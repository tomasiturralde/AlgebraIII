package Tp1;

/**
 * Ej 3 - Iterative & Recursive version
 *
 * Iterative & recursive implementation of Ej 3 task.
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */

public class Ej3 {

    /**
     * zeroCounter
     *
     * Checks how many zeros does an integer have.
     *
     * @param n A natural integer
     * @return How many zeros are within n parameter.
     */

    public int zeroCounter(int n){
      int counter = 0;
      char[] digitsAsChars = String.valueOf(n).toCharArray();
      int[] digits = new int[digitsAsChars.length];
      for (int i = 0; i < digitsAsChars.length; i++){
          digits[i] = digitsAsChars[i]-48;
          if (digits[i] == 0)
              counter++;
      }
      return counter;

    }

    /**
     * zeroCounterRecursive
     *
     * Recurisve version of zeroCounter.
     *
     * @param n A natural integer
     * @return How many zeros are within n parameter.
     */

    public int zeroCounterRecursive(int n){
        if(n == 0)
            return 0;

        if((n %10) == 0)
            return 1 + zeroCounterRecursive(n / 10);
        else
            return zeroCounterRecursive(n / 10);
    }
}
