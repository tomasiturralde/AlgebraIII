package Tp1;

/**
 * Created by Tomas on 13/3/2017.
 */
public class Ej1 {
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

    public int f(int n){
        return (((n*(n+1))/2)^2);
    }
}
