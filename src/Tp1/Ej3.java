package Tp1;

/**
 * Created by Tomas on 12/3/2017.
 */
public class Ej3 {

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

    public int zeroCounterRecursive(int n){
        if(n == 0)
            return 0;

        if((n %10) == 0)
            return 1 + zeroCounterRecursive(n / 10);
        else
            return zeroCounterRecursive(n / 10);
    }
}
