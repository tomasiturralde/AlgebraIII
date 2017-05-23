package Tp6;

import org.junit.Test;

/**
 * Tester for the methods on pratice 6, exercise 2.
 * @author Tomas Iturralde
 * @author Lautaro Paskevicius
 */
public class Ej2Test {
    @Test
    public void exerciseA(){
        double[][] matrix2 = {{2,2,0,0},
                {2,2,2,0},
                {0,2,2,2},
                {0,0,2,2}};
        Ej2v2 ej2 = new Ej2v2();
        System.out.println(ej2.exerciseA(matrix2, new CalculatorImpl()));
    }

    @Test
    public void exerciseB(){
        double[][] matrix2 = {{2,1,0,0},
                {2,5,2,0},
                {0,2,9,2},
                {0,0,2,3}};
        Ej2v2 ej2 = new Ej2v2();
        System.out.println(ej2.exerciseB(matrix2, new CalculatorImpl()));
    }
}
