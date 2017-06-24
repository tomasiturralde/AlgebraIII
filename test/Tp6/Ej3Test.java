package Tp6;

import org.junit.Test;

/**
 * Tester for the methods on pratice 6, exercise 3.
 * @author Tomas Iturralde
 * @author Lautaro Paskevicius
 */
public class Ej3Test {

    @Test
    public void exerciseAI() throws Exception {

        System.out.println("\n AI: ");

        double[][] matrix2 = {{2,2,2},
                              {0,2,2},
                              {0,0,2}};

        double[] vector = {1,1,1};
        Ej3 ej3 = new Ej3();

        double[] result = ej3.exerciseAI(matrix2,vector, new CalculatorImpl());

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    public void exerciseAII() throws Exception {

        System.out.println("\n AII: ");

        double[][] matrix2 = {{2,2,2},
                              {0,2,2},
                              {0,0,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseAII(matrix2,matrix2, new CalculatorImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseAIII() throws Exception {

        System.out.println("\n AIII: ");

        double[][] matrix2 = {{2,2,2},
                              {0,2,2},
                              {0,0,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseAIII(matrix2,matrix2, new CalculatorImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseBI() throws Exception {

        System.out.println("\n BI: ");

        double[][] matrix2 = {{3,3,3,3},
                              {3,3,3,3},
                              {0,3,3,3},
                              {0,0,3,3}};

        double[] vector = {1,1,1,1};
        Ej3 ej3 = new Ej3();

        double[] result = ej3.exerciseBI(matrix2,vector, new CalculatorImpl());

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    public void exerciseBII() throws Exception {

        System.out.println("\n BII: ");

        double[][] matrix2 = {{2,2,2,2},
                              {2,2,2,2},
                              {0,2,2,2},
                              {0,0,2,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseBII(matrix2,matrix2, new CalculatorImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseBIII() throws Exception {

        System.out.println("\n BIII: ");

        double[][] matrix2 = {{2,2,2,2},
                              {2,2,2,2},
                              {0,2,2,2},
                              {0,0,2,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseBIII(matrix2,matrix2, new CalculatorImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseCI() throws Exception {

        System.out.println("\n CI: ");

        double[][] matrix2 = {{2,2,0,0},
                              {2,2,2,0},
                              {0,2,2,2},
                              {0,0,2,2}};

        double[] vector = {1,1,1,1};
        Ej3 ej3 = new Ej3();

        double[] result = ej3.exerciseCI(matrix2,vector, new CalculatorImpl());

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    public void exerciseCII() throws Exception {
        System.out.println("\n CII: ");

        double[][] matrix2 = {{2,2,0,0},
                              {2,2,2,0},
                              {0,2,2,2},
                              {0,0,2,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseCII(matrix2,matrix2, new CalculatorImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseCIII() throws Exception {

        System.out.println("\n CIII: ");

        double[][] matrix2 = {{2,2,0,0},
                              {2,2,2,0},
                              {0,2,2,2},
                              {0,0,2,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseCIII(matrix2,matrix2, new CalculatorImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseDI() throws Exception {
        double[][] matrix2 = {{2,2,0,0},
                              {2,2,2,0},
                              {0,2,2,2},
                              {0,0,2,2}};

        double[] vector = {1,1,1,1};
        Ej3 ej3 = new Ej3();

        double[] result = ej3.exerciseDI(matrix2,1,1,vector, new CalculatorImpl());

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    public void exerciseDII() throws Exception {
        double[][] matrix2 = {{2,2,0,0},
                              {2,2,2,0},
                              {0,2,2,2},
                              {0,0,2,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseDII(matrix2,1,1,matrix2,1,1, new CalculatorImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseDIII() throws Exception {
        double[][] matrix2 = {{2,2,0,0},
                              {2,2,2,0},
                              {0,2,2,2},
                              {0,0,2,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseDIII(matrix2,1,1,matrix2,1,1, new CalculatorImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseE(){
        double[][] matrix1 = {{4,0,0},
                              {1,8,0},
                              {9,6,-3}};

        double[][] matrix2 = {{3,5,2},
                              {0,6,-1},
                              {0,0,7}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseE(matrix1,matrix2,new CalculatorImpl());

        ej3.print(result);
    }

}