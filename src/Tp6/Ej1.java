package Tp6;

import Tp6.Interfaces.Calculator;
import Tp6.Interfaces.Exercise1;

/**
 * Implementation of the methods on pratice 6, exercise 1.
 * @author Tomas Iturralde
 * @author Lautaro Paskevicius
 */
public class Ej1 implements Exercise1 {

    /**
     * Method which takes a matrix, must be a square one, and calculates the sum of its main diagonal.
     * @param matrix to be used for the calculation (must be square).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the sum of every value in the matrix' main diagonal.
     */
    @Override
    public double exerciseA(double[][] matrix, Calculator calculator) {
        if (matrix.length == matrix[0].length) {
            double result = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] != 0)
                    result = calculator.sum(result,matrix[i][i]);
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    /**
     * Method which takes a matrix, must be a square one, and calculates the sum of its secondary diagonal.
     * @param matrix to be used for the calculation (must be square).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the sum of every value in the matrix' secondary diagonal.
     */
    @Override
    public double exerciseB(double[][] matrix, Calculator calculator) {
        if (matrix.length == matrix[0].length){
            double result = 0;
            for (int i = 0,j = matrix.length-1; i < matrix.length || j >= 0; i++, j--){
                result = calculator.sum(result,matrix[i][j]);
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    /**
     * Method which creates a vector with its values being the sum of every value on one row.
     * @param matrix to be used for the calculation.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return a vector with the values of the sums of every rows' values.
     */
    @Override
    public double[] exerciseC(double[][] matrix, Calculator calculator) {
        if (matrix.length == matrix[0].length){
            double[] result = new double[matrix.length];
            for (int i = 0; i < matrix[0].length; i++){
                double resultToAdd = 0;
                for (int j = 0; j < matrix.length; j++){
                    if (matrix[i][j] != 0)
                        resultToAdd = calculator.sum(resultToAdd,matrix[i][j]);
                }
                result[i] = resultToAdd;
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    /**
     * Method which takes a matrix and a vector and multiplies them.
     * @param matrix to be used for the calculation.
     * @param vector to be used for the calculation.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the vector with the result of the multiplications.
     */
    @Override
    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator) {
        if (matrix.length == vector.length){
            double[] result = new double[matrix.length];
            for (int i = 0; i < matrix[0].length; i++){
                double resultToAdd = 0;
                for (int j = 0; j < matrix.length; j++){
                    if (matrix[i][j] != 0 && vector[j] != 0)
                        resultToAdd = calculator.sum(resultToAdd,calculator.multiplication(matrix[i][j],vector[j]));
                }
                result[i] = resultToAdd;
            }
            return result;
        }
        throw new RuntimeException("The amount of columns in the matrix must be equal to the vector's length");
    }

    /**
     * Method which takes to matrices and sums them.
     * @param matrixA to be used for the calculation (must have the same dimensions as matrixB).
     * @param matrixB to be used for the calculation (must have the same dimensions as matrixA).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of summing both matrices.
     */
    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length){
            double[][] sum = new double[matrixA.length][matrixB[0].length];
            for (int i = 0; i < matrixA.length; i++){
                for (int j = 0; j < matrixB[0].length; j++){
                    sum[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
            return sum;
        }
        throw new RuntimeException("Both dimensions must be equal");
    }

    /**
     * Method which takes two matrices and multiplies them (the amount of columns on matrixA must be the same as the
     * amount of rows on matrixB).
     * @param matrixA to be used for the calculation.
     * @param matrixB to be used for the calculation.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of multiplying both matrices.
     */
    @Override
    public double[][] exerciseF(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixB[0].length];

            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0; i < matrixA.length; i++){
                    double toAdd = 0;
                    for(int k = 0; k < matrixA.length; k++){
                        toAdd = calculator.sum(toAdd, calculator.multiplication(matrixA[i][k],matrixB[k][j]));
                    }
                    result[i][j] = toAdd;
                }
            }
            return result;
        }

        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes a matrix and transposes it.
     * @param matrix to be transposed.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the transposed matrix.
     */
    @Override
    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        double[][] result = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++)
                result[j][i] = matrix[i][j];
        }
        return result;
    }
}
