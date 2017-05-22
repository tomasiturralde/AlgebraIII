package Tp6;

import Tp6.Interfaces.Calculator;
import Tp6.Interfaces.Exercise1;

/**
 * Created by Tomas on 9/5/2017.
 */
public class Ej1 implements Exercise1 {

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

    @Override
    public double exerciseB(double[][] matrix, Calculator calculator) {
        if (matrix.length == matrix[0].length){
            double result = 0;
            for (int i = 0; i < matrix.length; i++){
                for (int j = matrix[0].length; j > 0; j--){
                    if (matrix[i][j] != 0)
                        result = calculator.sum(result,matrix[i][j]);
                }
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    @Override
    public double[] exerciseC(double[][] matrix, Calculator calculator) {
        if (matrix.length == matrix[0].length){
            double[] result = new double[matrix.length];
            for (int i = 0; i < matrix[0].length; i++){
                double resultToAdd = 0;
                for (int j = 0; j < matrix.length; j++){
                    if (matrix[j][i] != 0)
                        resultToAdd = calculator.sum(resultToAdd,matrix[j][i]);
                }
                result[i] = resultToAdd;
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    @Override
    public double[] exerciseD(double[][] matrix, double[] vector, Calculator calculator) {
        if (matrix.length == vector.length){
            double[] result = new double[matrix.length];
            for (int i = 0; i < matrix[0].length; i++){
                double resultToAdd = 0;
                for (int j = 0; j < matrix.length; j++){
                    if (matrix[j][i] != 0 && vector[j] != 0)
                        resultToAdd = calculator.sum(resultToAdd,calculator.multiplication(matrix[j][i],vector[j]));
                }
                result[i] = resultToAdd;
            }
            return result;
        }
        throw new RuntimeException("The amount of columns in the matrix must be equal to the vector's length");
    }

    @Override
    public double[][] exerciseE(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length){
            double[][] sum = new double[matrixA.length][matrixB[0].length];
            for (int i = 0; i < matrixA.length; i++){
                for (int j = 0; j < matrixB[0].length; j++){
                    if (matrixA[i][j] == 0)
                        sum[i][j] = matrixB[i][j];
                    else if (matrixB[i][j] == 0)
                        sum[i][j] = matrixA[i][j];
                    else
                        sum[i][j] = calculator.sum(matrixA[i][j], matrixB[i][j]);
                }
            }
            return sum;
        }
        throw new RuntimeException("Both dimensions must be equal");
    }

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
