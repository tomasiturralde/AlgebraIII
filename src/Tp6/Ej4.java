package Tp6;

import Tp6.Interfaces.Calculator;
import Tp6.Interfaces.Exercise4;

/**
 * Implementation of the methods on pratice 6, exercise 4.
 * @author Tomas Iturralde
 * @author Lautaro Paskevicius
 */
public class Ej4 implements Exercise4{

    /**
     * Method which uses a simplified version of a matrix by storing it on a vector, without storing zeros, to sum two
     * of those vectors, and then insert that result on an upper triangular matrix.
     * @param matrixA an upper triangular matrix which has been converted into a vector to save space.
     * @param matrixB an upper triangular matrix which has been converted into a vector to save space.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the upper triangular matrix with its values being the sum of matrixA values with matrixB's ones.
     */
    @Override
    public double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator) {
        if (matrixA.length == matrixB.length) {
            double[] summation = new double[matrixA.length];
            for (int i = 0; i < matrixA.length; i++) {
                summation[i] = calculator.sum(matrixA[i], matrixB[i]);
            }

            double[][] result = new double[dimensionFinder(matrixA.length)][dimensionFinder(matrixB.length)];
            int k = 0;
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    if (j < i)
                        result[i][j] = 0;
                    else {
                        result[i][j] = summation[k];
                        k++;
                    }
                }
            }
            return result;
        }
        throw new RuntimeException("Both vectors must have the same length");
    }

    /**
     * private methods which uses the simplified version of the summation of i to find the dimension of a matrix which
     * is upper triangular.
     * @param n the result of the summation of i
     * @return the dimension of the upper triangular matrix
     */
    private int dimensionFinder(int n){
        return (int)((-1 + Math.sqrt(1 + 8 * n)) / 2);
    }
}
