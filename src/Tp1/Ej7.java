package Tp1;

/**
 * Created by Tomas on 19/3/2017.
 */
public class Ej7 {

    public static int MCD(int a, int b){
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int mcd(int a, int b){
        if(b == 0)
            return a;
        return mcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(MCD(123, 277)); //result = 1
        System.out.println(MCD(111, 201)); //result = 3
        System.out.println(MCD(14039, 1529)); //result = 139
    }
}
