package Tp7;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testers for every exercise in practice number 7.
 * @author Tomas Iturralde.
 * @author Lautaro Paskevicius.
 */
public class ExercisesTest {

    @Test
    public void exercise8() throws Exception {
        Exercises exercises = new Exercises();

        double[][] matA = {{2,2,2},
                {6,0,2},
                {4,4,8}};

        //{0.1666 , 0.1666 , -0.8333}       Result calculated w/ matrix.reshish.com
        //{0.8333 , -0.1666 , -0.1666}
        //{-0.5 , 0 , 0.25}

        exercises.print(exercises.exercise8(matA));

    }

    @Test
    public void exercise7() throws Exception {
        Exercises exc = new Exercises();

        double[][] matA = {{1,2,0},
                {2,3,1},
                {0,2,4}};

        double[] vec1 = {3,6,6};

        for (double e : exc.exercise7(matA,vec1,new CalculatorImpl())){
            System.out.println(e);
        }
    }

    @Test
    public void exercise2() throws Exception {
        Exercises exc = new Exercises();

        double[][] matA = {{1,0,0},
                {1,1,0},
                {1,1,1}};

        double[] vec1 = {1,1,1};

        double[][] matB = {{1,0,0},
                {1,1,0},
                {1,1,1}};

        double[] vec2 = {1,1,2};

        for (double e : exc.exercise2(matA,vec1)){
            System.out.println(e);
        }

        System.out.println();

        for (double e : exc.exercise2(matB,vec2)){
            System.out.println(e);
        }
    }

    @Test
    public void exercise1() throws Exception {
        Exercises exc = new Exercises();

        //Ahh que verga no se que onda, a mi me anda joya

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

    @Test
    public void exercise5WithoutPivoteo(){
        double[][] coefficients = {{5.0,2.0,6.0},{3.0,4.0,1.0},{6.0,1.0,2.0}};
        double[] independent = {1.0,2.0,3.0};
        Exercises exercises = new Exercises();
        exercises.print(coefficients);
        double[] result1 = exercises.exercise5WithoutPivoteo(coefficients,independent);
        System.out.println("------");
        for (double aResult : result1) {
            System.out.println(aResult);
        }
    }

    @Test
    public void exercise5PartialPivoteo(){
        double[][] coefficients = {{5.0,2.0,6.0},{3.0,4.0,1.0},{6.0,1.0,2.0}};
        double[] independent = {1.0,2.0,3.0};
        Exercises exercises = new Exercises();
        exercises.print(coefficients);
        double[] result1 = exercises.exercise5PartialPivoteo(coefficients,independent);
        System.out.println("------");
        for (double aResult : result1) {
            System.out.println(aResult);
        }
    }

    @Test
    public void exercise6(){
        double[][] coefficients = {{5.0,2.0,6.0,7.0},{3.0,4.0,1.0,2.0},{0.0,1.0,2.0,5.0},{0.0,0.0,2.0,3.0}};
        double[] independent = {1.0,2.0,3.0,4.0};
        Exercises exercises = new Exercises();
        exercises.print(coefficients);
        double[] result1 = exercises.exercise6(coefficients,independent, new CalculatorImpl());
        System.out.println("------");
        exercises.print(coefficients);
        System.out.println("------");
        for (double aResult : result1) {
            System.out.println(aResult);
        }
    }

    @Test
    public void exercise9(){
        double[][] coefficients = {{5.0,2.0,6.0,7.0},{3.0,4.0,1.0,2.0},{9.0,1.0,2.0,5.0},{3.0,-1.0,2.0,3.0}};
        double[] independent = {1.0,2.0,3.0,4.0};
        Exercises exercises = new Exercises();
        exercises.print(coefficients);
        double[] result1 = exercises.exercise9(coefficients,independent);
        System.out.println("------");
        for (double aResult : result1) {
            System.out.println(aResult);
        }
    }
}