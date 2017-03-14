package Tp1;

/**
 * Created by Tomas on 12/3/2017.
 */
public class Ej4 {
    public boolean capicua(int[] list){
        int counter = 0;
        for (int i = 0, j = list.length-1; j >= i; i++, j--){
            if (list[i] != list[j])
                    counter++;

        }
        if (counter == 0)
            return true;
        return false;
    }
}
