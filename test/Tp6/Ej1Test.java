package Tp6;

import org.junit.Test;

/**
 * Tester for the methods on pratice 6, exercise 1.
 * @author Tomas Iturralde
 * @author Lautaro Paskevicius
 */
public class Ej1Test {
    @Test
    public void exercises() throws Exception {

        double[][] matrix1 = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};

        double[][] matrix2 = {{2,2,2,2},
                {2,2,2,2},
                {2,2,2,2},
                {2,2,2,2}};

        double[][] matrix3 = {{2,4,1,7},
                {3,5,9,4},
                {-1,3,6,8},
                {10,-3,7,5}};

        double[] vector = {3,3,3,3};

        Ej1 ej1 = new Ej1();
        Ej3 ej3 = new Ej3();

        double result = ej1.exerciseA(matrix1, new CalculatorImpl());
        double result1 = ej1.exerciseB(matrix1, new CalculatorImpl());
        double[] result2 = ej1.exerciseC(matrix1, new CalculatorImpl());
        double[] result3 = ej1.exerciseD(matrix1, vector, new CalculatorImpl());
        double[][] result4 = ej1.exerciseE(matrix1, matrix2, new CalculatorImpl());
        double[][] result5 = ej1.exerciseF(matrix1,matrix2, new CalculatorImpl());
        double[][] result6 = ej1.exerciseG(matrix3, new CalculatorImpl());

        System.out.println(result);
        System.out.println("----------------");
        System.out.println(result1);
        System.out.println("----------------");
        for (double aResult2 : result2) {
            System.out.print(aResult2 + ", ");
        }
        System.out.println("\n----------------");
        for (double aResult3 : result3) {
            System.out.print(aResult3 + ", ");
        }
        System.out.println("\n----------------");
        ej3.print(result4);
        System.out.println("----------------");
        ej3.print(result5);
        System.out.println("----------------");
        ej3.print(result6);
    }

}