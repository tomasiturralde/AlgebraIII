package Tp6;

import Tp6.Interfaces.Calculator;
import Tp6.Interfaces.Exercise2;

/**
 * Implementation of the methods on pratice 6, exercise 2.
 * @author Tomas Iturralde
 * @author Lautaro Paskevicius
 */
public class Ej2v2 implements Exercise2 {

    /**
     * Method used to check if a matrix is symmetric.
     * @param matrix to be used for the calculation (must be square).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return true if it's symmetric, false if otherwise.
     */
    @Override
    public boolean exerciseA(double[][] matrix, Calculator calculator) {
        if(matrix.length == matrix[0].length){
            boolean answer = true;
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if(i == j) continue;

                    if(matrix[i][j] != matrix[j][i]) answer = false;
                }
            }

            return answer;
        }

        throw new RuntimeException("Invalid matrix. Must be square.");
    }

    /**
     * Method used to check if a matrix is diagonally dominant.
     * @param matrix to be used for the calculation (must be square).
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return true if it's diagonally dominant, false if otherwise.
     */
    @Override
    public boolean exerciseB(double[][] matrix, Calculator calculator) {
        if(matrix.length == matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                double sum = 0;
                double diagonal = matrix[i][i];
                for (int j = 0; j < matrix[0].length; j++) {
                    if (i != j) calculator.sum(sum, Math.abs(matrix[i][j]));
                }
                if (diagonal < sum) return false;
            }
            return true;
        }
        throw new RuntimeException("Invalid matrix. Must be square.");
    }
}