package Tp6;

import Tp6.Interfaces.Calculator;
import Tp6.Interfaces.Exercise3;

/**
 * Created by Tomas on 16/5/2017.
 */
public class Ej3 implements Exercise3{
    @Override
    public double[] exerciseAI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        if (matrixA.length == vectorX.length){
            double[] result = new double[matrixA.length];
            for (int i = 0; i < matrixA[0].length; i++){
                double resultToAdd = 0;
                for (int j = i; j < matrixA.length; j++){
                    if (matrixA[j][i] != 0 && vectorX[j] != 0)
                        resultToAdd = calculator.sum(resultToAdd,calculator.multiplication(matrixA[j][i],vectorX[j]));
                }
                result[i] = resultToAdd;
            }
            return result;
        }
        throw new RuntimeException("The amount of columns in the matrix must be equal to the vector's length");
    }

    @Override
    public double[][] exerciseAII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length){
            double[][] sum = new double[matrixA.length][matrixB[0].length];
            for (int i = 0; i < matrixA.length; i++){
                for (int j = i; j < matrixB[0].length; j++){
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
    public double[][] exerciseAIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        if (matrixA.length == matrixB[0].length){
            double[][] product = new double[matrixA[0].length][matrixB.length];
            for (int k = 0; k < matrixB.length; k++) {
                for (int i = 0; i < matrixA[0].length; i++) {
                    double resultToAdd = 0;
                    for (int j = 0; j < matrixA.length; j++) {
                        if (matrixA[i][j] != 0 && matrixB[k][j] != 0)
                            resultToAdd = calculator.sum(resultToAdd,calculator.multiplication(matrixA[i][j],matrixB[k][j]));
                    }
                    product[i][k] = resultToAdd;
                }
            }
            return product;
        }
        throw new RuntimeException("The first matrix's columns must be equal to the second's rows");
    }

    @Override
    public double[] exerciseBI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseBII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseBIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[] exerciseCI(double[][] matrixA, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseCII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseCIII(double[][] matrixA, double[][] matrixB, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[] exerciseDI(double[][] matrixA, int k1A, int k2A, double[] vectorX, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exerciseDII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        return new double[0][];
    }

    @Override
    public double[][] exerciseDIII(double[][] matrixA, int k1A, int k2A, double[][] matrixB, int k1B, int k2B, Calculator calculator) {
        return new double[0][];
    }

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
}
