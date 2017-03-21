package Tp1;

/**
 * Ej 5 - Iterative & Recursive version
 *
 * Implementation of Ej 5 subsections.
 *
 * @author Tomas Iturralde & Lautaro Paskevicius
 */

public class Ej5 {

    /**
     * searchNumber
     *
     * Checks if an integer belongs to the list passed.
     *
     * @param k integer to look for.
     * @param list list to be searched.
     * @return true/false if param k belongs to param list.
     */

    public boolean searchNumber(int k, int[] list){
        for (int i : list){
            if (i == k)
                return true;
        }
        return false;
    }

    /**
     * searchNumberRecursive
     *
     * public caller of searchNumberRecursive()
     *
     * @param list A possibly palindrome list of natural integers.
     * @return true/false if the list is a palindrome or not.
     */

    public boolean searchNumberRecursive(int k, int[] list){
        return searchNumberRecursive(k, list, 0, list.length - 1);
    }

    /**
     * searchNumberRecursive
     *
     * Recursive version of searchNumber().
     *
     * @param k integer to look for.
     * @param list list to be searched.
     * @param first partitioned half's first index.
     * @param last partitioned half's last index.
     * @return true/false if param k belongs to param list.
     */

    private boolean searchNumberRecursive(int k, int[] list, int first, int last){
        if (first > last)
            return false;
        int middle = (first + last)/2;
        int i = list[middle];
        if (k == i)
            return true;
        if (k < i)
            return searchNumberRecursive(k, list, first, middle - 1);
        else
            return searchNumberRecursive(k, list, middle + 1, list.length - 1);

    }

}
