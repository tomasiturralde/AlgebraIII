package Tp6;

import Tp6.Interfaces.Calculator;
import Tp6.Interfaces.Exercise3;

/**
 * Created by Tomas on 16/5/2017.
 */
public class Ej3 implements Exercise3{

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
        if(matrixA[0].length == matrixB.length ){
            double[][] result = new double[matrixA.length][matrixB[0].length];

            for(int j = 0; j < matrixA.length; j++){
                for(int i = j; i < matrixA.length; i++){
                    double toAdd = 0;
                    for(int k = matrixA.length - i; k < matrixA.length; k++){
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
        return new double[0][];
    }


    public void print(double[][] result) {
        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
