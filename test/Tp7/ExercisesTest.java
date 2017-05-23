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

}