package Tp6;

import Tp6.Interfaces.Calculator;
import Tp6.Interfaces.Exercise3;

/**
 * Implementation of the methods on pratice 6, exercise 3.
 * @author Tomas Iturralde
 * @author Lautaro Paskevicius
 */
public class Ej3 implements Exercise3{

    /**
     * Method which takes a matrix and a vector and multiplies them.
     * @param matrixA to be used for the calculation(must be square and upper triangular).
     * @param vector to be used for the calculation.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the vector with the result of the multiplications.
     */
    @Override
    public double[] exerciseAI(double[][] matrixA, double[] vector, Calculator calculator) {
        if(matrixA[0].length == vector.length ){
            double[] result = new double[vector.length];

            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0; i <= j; i++){
                    double toAdd = 0;
                    for(int k = i; k <= j; k++){
                        toAdd = calculator.sum(toAdd, calculator.multiplication(matrixA[i][k],vector[k]));
                    }
                    result[i] = toAdd;

                }
            }

            return result;
        }

        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes to matrices and sums them (Both must be square and upper triangular).
     * @param matrixA to be used for the calculation (must have the same dimensions as matrixB).
     * @param matrixB to be used for the calculation (must have the same dimensions as matrixA).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of summing both matrices.
     */
    @Override
    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixA.length];

            for(int i = 0; i < matrixA.length; i++){
                for(int j = i; j < matrixA[0].length; j++){
                    result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }

            return result;
        }

        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes two matrices and multiplies them (the amount of columns on matrixA must be the same as the
     * amount of rows on matrixB).
     * @param matrixA to be used for the calculation (must be square and upper triangular).
     * @param matrixB to be used for the calculation (must be square and upper triangular).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of multiplying both matrices.
     */
    @Override
    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixB[0].length];

            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0; i <= j; i++){
                    double toAdd = 0;
                    for(int k = i; k <= j; k++){
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
     * Method which takes a matrix and a vector and multiplies them.
     * @param matrixA to be used for the calculation(must be a Hessenberg matrix).
     * @param vectorX to be used for the calculation.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the vector with the result of the multiplications.
     */
    @Override
    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        if (matrixA[0].length == vectorX.length){
            double[] result = new double[vectorX.length];
            for(int j = 0; j < matrixA.length; j++) {
                double toAdd = 0;
                for (int i = 0; i < j + 2 && i < matrixA[0].length; i++) {
                     toAdd = calculator.sum(toAdd, calculator.multiplication(matrixA[i][j], vectorX[j]));
                }
                result[j] = toAdd;
            }
            return result;
        }
        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes to matrices and sums them (Both must Hessenberg matrices).
     * @param matrixA to be used for the calculation (must have the same dimensions as matrixB).
     * @param matrixB to be used for the calculation (must have the same dimensions as matrixA).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of summing both matrices.
     */
    @Override
    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixB[0].length];

            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0;i < j+2 && i < matrixA.length; i++){
                    result[i][j] = calculator.sum(matrixA[i][j],matrixB[i][j]);
                }
            }
            return result;
        }

        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes two matrices and multiplies them (the amount of columns on matrixA must be the same as the
     * amount of rows on matrixB).
     * @param matrixA to be used for the calculation (must be a Hessenberg matrix).
     * @param matrixB to be used for the calculation (must be a Hessenberg matrix).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of multiplying both matrices.
     */
    @Override
    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixB[0].length];

            for(int j = 0; j <= matrixA.length-1; j++){
                for(int i = 0; i <= matrixA.length-1; i++){
                    double toAdd = 0;
                    for(int k = 0; k <= matrixA.length-1; k++){
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
     * Method which takes a matrix and a vector and multiplies them.
     * @param matrixA to be used for the calculation(must be a tridiagonal matrix).
     * @param vectorX to be used for the calculation.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the vector with the result of the multiplications.
     */
    @Override
    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        if(matrixA[0].length == vectorX.length ){
            double[] result = new double[vectorX.length];

            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0; i < matrixA.length; i++){
                    double toAdd = 0;
                    for(int k = 0; Math.abs(j - i) <= 1 && k < vectorX.length; k++){
                        toAdd = calculator.sum(toAdd, calculator.multiplication(matrixA[i][k],vectorX[k]));
                    }
                    if(Math.abs(j - i) <= 1) j++;
                    result[i] = toAdd;
                }
            }
            return result;
        }

        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes to matrices and sums them (Both must tridiagonal matrices).
     * @param matrixA to be used for the calculation (must have the same dimensions as matrixB).
     * @param matrixB to be used for the calculation (must have the same dimensions as matrixA).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of summing both matrices.
     */
    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixB[0].length];

            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0; i < matrixA.length ;i++){
                    if(Math.abs(j - i) <= 1 ) result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
            return result;
        }

        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes two matrices and multiplies them (the amount of columns on matrixA must be the same as the
     * amount of rows on matrixB).
     * @param matrixA to be used for the calculation (must be a tridiagonal matrix).
     * @param matrixB to be used for the calculation (must be a tridiagonal matrix).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of multiplying both matrices.
     */
    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixB[0].length];

            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0; i < matrixA.length; i++){
                    double toAdd = 0;
                    for(int k = 0; k < matrixA.length; k++){
                        if(Math.abs(j - i) <= 2)
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
     * Method which takes a matrix and a vector and multiplies them.
     * @param matrixA to be used for the calculation(must be a band matrix).
     * @param vectorX to be used for the calculation.
     * @param k1A amount of sub-diagonals left from the main diagonal of the matrix.
     * @param k2A amount of sub-diagonals right from the main diagonal of the matrix.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the vector with the result of the multiplications.
     */
    @Override
    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator) {
        if(matrixA[0].length == vectorX.length ){
            if(k1A != k2A) System.out.println("Only works with p - diagonal matrices!");
            double[] result = new double[vectorX.length];
            for(int i = 0; i < matrixA.length; i++){
                double toAdd = 0;
                for(int j = 0; j < matrixA[0].length; j++){
                    if(Math.abs(j - i) <= k1A+1) {
                        toAdd = calculator.sum(toAdd, calculator.multiplication(matrixA[i][j], vectorX[j]));
                    }

                }result[i] = toAdd;
            }
            return result;
        }
        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes to matrices and sums them (Both must band matrices).
     * @param matrixA to be used for the calculation (must have the same dimensions as matrixB).
     * @param k1A amount of sub-diagonals left from the main diagonal of the first matrix.
     * @param k2A amount of sub-diagonals right from the main diagonal of the first matrix.
     * @param matrixB to be used for the calculation (must have the same dimensions as matrixA).
     * @param k1B amount of sub-diagonals left from the main diagonal of the second matrix.
     * @param k2B amount of sub-diagonals right from the main diagonal of the second matrix.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of summing both matrices.
     */
    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixB[0].length];
            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0; i < matrixA.length ;i++){
                    if(Math.abs(j - i) <= k1A ) result[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
            return result;
        }
        throw new RuntimeException("Matrices dimensions are not correct!");
    }

    /**
     * Method which takes two matrices and multiplies them (the amount of columns on matrixA must be the same as the
     * amount of rows on matrixB).
     * @param matrixA to be used for the calculation (must be a band matrix).
     * @param k1A amount of sub-diagonals left from the main diagonal of the first matrix.
     * @param k2A amount of sub-diagonals right from the main diagonal of the first matrix.
     * @param matrixB to be used for the calculation (must be a band matrix).
     * @param k1B amount of sub-diagonals left from the main diagonal of the second matrix.
     * @param k2B amount of sub-diagonals right from the main diagonal of the second matrix.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of multiplying both matrices.
     */
    @Override
    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        if(matrixA[0].length == matrixB.length ){
            if(k1A != k2A || k1B != k2B || k1A != k1B) System.out.println("Only works with p - diagonal matrices!");
            double[][] result = new double[matrixA.length][matrixB[0].length];
            for(int j = 0; j < matrixA.length; j++){
                for(int i = 0; i < matrixA.length; i++){
                    double toAdd = 0;
                    for(int k = 0; k < matrixA.length; k++){
                        if(Math.abs(j - i) <= k1A + 1)
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
     * Method which takes two matrices and multiplies them (the amount of columns on matrixA must be the same as the
     * amount of rows on matrixB).
     * @param matrixA to be used for the calculation (must be a lower triangular matrix).
     * @param matrixB to be used for the calculation (must be an upper triangular matrix).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the matrix with the result of multiplying both matrices.
     */
    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        double[][] result = new double[matrixA[0].length][matrixB.length];
        for (int i = 0; i < matrixA[0].length; i++) {
            for (int k = 0; k < matrixB.length; k++) {
                double resultToAdd = 0;
                for (int j = 0, l = 0; j <= i && l <= k; j++, l++) {
                    resultToAdd = calculator.sum(resultToAdd,calculator.multiplication(matrixA[i][j],matrixB[l][k]));
                }
                result[i][k] = resultToAdd;
            }
        }
        return result;
    }

    /**
     * Method used to print matrices.
     * @param result the matrix to be printed.
     */
    public void print(double[][] result) {
        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
