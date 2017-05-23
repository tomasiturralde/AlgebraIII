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

        double[][] matA = {{1,1,1},
                           {0,1,1},
                           {0,0,1}};

        double[] vec1 = {1,1,1};

        double[][] matB = {{1,1,1},
                {0,1,1},
                {0,0,1}};

        double[] vec2 = {2,1,1};

        for (double e : exc.exercise1(matA,vec1)){
            System.out.println(e);
        }
        System.out.println();
        for (double e : exc.exercise1(matB,vec2)){
            System.out.println(e);
        }
    }

}