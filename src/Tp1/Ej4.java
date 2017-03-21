package Tp1;

/**
 * Ej 4 - Iterative & Recursive version
 *
 * Iterative & recursive implementation of Ej 4 subsections.
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */
public class Ej4 {

    /**
     * palindrome
     *
     * Checks if a list is a palindrome or not.
     *
     * @param list A possible palindrome list of natural integers.
     * @return true/false if the list is a palindrome or not.
     */

    public boolean palindrome(int[] list){
        int counter = 0;
        for (int i = 0, j = list.length-1; j >= i; i++, j--){
            if (list[i] != list[j])
                    counter++;

        }
        return counter == 0;
    }

    /**
     * palindrome
     *
     * Recursive version of  palindrome().
     *
     * @param list A possible palindrome list of natural integers.
     * @return true/false if the list is a palindrome or not.
     */

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
