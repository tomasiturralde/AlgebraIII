package Tp7;

/**
 * Created by Tomas on 23/5/2017.
 */
public class Exercises implements TP4 {

    public double[][] exercise1(int n, double[][] coefficients, double[] independentTerms) {
        return extend(coefficients, independentTerms);
    }

    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise5WithoutPivoteo(double[][] coefficients, double[] independentTerms) {
        for (int k = 0; k < coefficients.length; k++) {
            double diagonal = coefficients[k][k];
            for (int j = k; j < coefficients[0].length; j++)
                coefficients[k][j] = (coefficients[k][j]/diagonal);
            independentTerms[k] = (independentTerms[k]/diagonal);
            for (int i = k+1; i < coefficients.length; i++) {
                double multiplier = coefficients[i][k];
                for (int j = k; j < coefficients[0].length; j++)
                    coefficients[i][j] = (coefficients[i][j] - multiplier*coefficients[k][j]);
                independentTerms[i] = independentTerms[i] - multiplier*independentTerms[k];
            }
        }
        return exercise1(coefficients, independentTerms);
    }

    @Override
    public double[] exercise5PartialPivoteo(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    @Override
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
        return new double[0][];
    }

    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        return new double[0];
    }

    void print(double[][] mat){
        for(int i=0; i < mat.length; i++){
            for(int j=0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private double[][] extend(double[][] coefficients, double[] independentTerms){
        double[][] extendedMat = new double[coefficients.length][coefficients[0].length+1];

        for(int i = 0; i < coefficients.length; i++){
            for(int j = 0; j < coefficients.length; j++){
                extendedMat[i][j] = coefficients[i][j];
            }
        }

        for(int i = 0; i < extendedMat.length; i++){
            extendedMat[i][coefficients.length] = independentTerms[i];
        }

        return extendedMat;
    }
}
