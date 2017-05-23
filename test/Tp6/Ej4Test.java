package Tp6;

import org.junit.Test;

/**
 * Tester for the methods on pratice 6, exercise 4.
 * @author Tomas Iturralde
 * @author Lautaro Paskevicius
 */
public class Ej4Test {
    @Test
    public void exercise4(){
        double[] matrixA = {4,5,3,7,6,1,2,8,6,2};
        Ej4 ej4 = new Ej4();
        Ej3 ej3 = new Ej3();

        double[][] result = ej4.summation(matrixA, matrixA, new CalculatorImpl());
        ej3.print(result);
    }
}
