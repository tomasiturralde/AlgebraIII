package Tp1;

/**
 * Created by Tomas on 19/3/2017.
 */
public class Ej5 {
    public boolean searchNumber(int k, int[] list){
        for (int i : list){
            if (i == k)
                return true;
        }
        return false;
    }

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

    public boolean searchNumberRecursive(int k, int[] list){
        return searchNumberRecursive(k, list, 0, list.length - 1);
    }
}
