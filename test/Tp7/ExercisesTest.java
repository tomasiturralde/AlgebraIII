package Tp7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 23/05/2017.
 */
public class ExercisesTest {
    @Test
    public void exercise1() throws Exception {
        Exercises exc = new Exercises();

        double[][] matA = {{1,1,1},{0,1,1},{0,0,1}};
        double[] vec = {1,1,1};

        double[][] res = exc.exercise1(1,matA,vec);

        exc.print(res);
    }

    @Test
    public void exercise5WithoutPivoteo(){
        double[][] coefficients = {{5.0,2.0,6.0},{3.0,4.0,1.0},{6.0,1.0,2.0}};
        double[] independent = {1.0,2.0,3.0};
        Exercises exercises = new Exercises();
        exercises.print(coefficients);
        double[] result1 = exercises.exercise5WithoutPivoteo(coefficients,independent);
        double[][] result =  exercises.blabla(coefficients,independent);
        System.out.println("------");
        exercises.print(result);
        System.out.println("-----");
        for (double aResult : result1) {
            System.out.println(aResult + ", ");
        }
    }
}