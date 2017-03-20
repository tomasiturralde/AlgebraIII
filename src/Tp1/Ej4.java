package Tp1;

/**
 * Created by Tomas on 12/3/2017.
 */
public class Ej4 {

    public boolean palindrome(int[] list){
        int counter = 0;
        for (int i = 0, j = list.length-1; j >= i; i++, j--){
            if (list[i] != list[j])
                    counter++;

        }
        return counter == 0;
    }

    public boolean palindromeRecursive(int[] list, int start, int last){
        if(list.length == 0 || list.length == 1)
            return true;

        if(start >= last)
            return true;

        if (list[start] != list[last]){
            return false;
        }

        return palindromeRecursive(list, start + 1, last - 1);
    }
}
