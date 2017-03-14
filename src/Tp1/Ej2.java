package Tp1;

/**
 * Created by Tomas on 13/3/2017.
 */
public class Ej2 {
    public static int factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return n*factorial(n - 1);

    }

    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
