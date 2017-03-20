package Tp1;

/**
 * Created by Tomas on 13/3/2017.
 */
public class Ej1Iterative {

    public int a(int n){
        int result = 0;
        for (int i = 1; i < n+1; i++){
            result += i;
        }

        return result;
    }

    public int b(int n){
        int result = 0;
        for (int i = 1; i < n+1; i++){
            result += Math.pow(i, 2);
        }

        return result;
    }

    public int c(int p, int n){
        int result = 1;
        int i = 0;
        while (i <= n){
            result += Math.pow(p, i);
            i++;
        }
        return result;
    }

    public int d(int n){
        int result = 1;
        for (int i = 0; i <= n; i++) {
            result += (2*i-1);
        }
        return result;
    }

    public static int e(int n){
        int result = 0;
        int i = 0;
        while (i <= n){
            result += (i*(i+1));
            i++;
        }
        return result;
    }

    public static int f(int n){
        int result = 0;
        int i = 0;
        while (i <= n){
            result += Math.pow(i, 3);
            i++;
        }
        return result;
    }
}
