package Tp1;

/**
 * Created by Tomas on 12/3/2017.
 */
public class Ej4<T extends Comparable<T>> {
    public boolean capicua(T[] list){
        int counter = 0;
        for (int i = 0, j = list.length-1; j >= i; i++, j--){
            if (list[i].compareTo(list[j]) != 0)
                    counter++;

        }
        if (counter == 0)
            return true;
        return false;
    }
}
