package Tp6;

import Tp6.Interfaces.Calculator;
import Tp6.Interfaces.Exercise4;

/**
 * Created by Tomas on 21/5/2017.
 */
public class Ej4 implements Exercise4{

    @Override
    public double[][] summation(double[] matrixA, double[] matrixB, Calculator calculator) {
        if (matrixA.length == matrixB.length) {
            double[] summation = new double[matrixA.length];
            for (int i = 0; i < matrixA.length; i++) {
                summation[i] = calculator.sum(matrixA[i], matrixB[i]);
            }

            double[][] result = new double[dimensionFinder(matrixA.length)][dimensionFinder(matrixB.length)];

            return result;
        }
        throw new RuntimeException("Both vectors must have the same length");
    }

    private int dimensionFinder(int n){
        return (int)((-1 + Math.sqrt(1 + 8 * n)) / 2);
    }
}
