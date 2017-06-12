package Tp7;

/**
 * Created by Tomas on 23/5/2017.
 */
public class Exercises implements TP4 {

    @Override
    public double[] exercise1(double[][] coefficients, double[] independentTerms) {

        double[] solution = new double[independentTerms.length];

        for(int i = coefficients.length-1; i >= 0; i--){
            double isolate = 0;

            for(int j = i+1; j < coefficients.length; j++){
                isolate += coefficients[i][j] * solution[j];
            }

            solution[i] = independentTerms[i] - isolate;
        }

        return solution;
    }

    @Override
    public double[] exercise2(double[][] coefficients, double[] independentTerms) {
        double[] solution = new double[independentTerms.length];

        for(int i = 0; i < coefficients.length; i++){
            double isolate = 0;
            for(int j = 0; j < i; j++){
                isolate += coefficients[i][j] * solution[j];
            }
            solution[i] = (independentTerms[i] - isolate) / coefficients[i][i];
        }

        return solution;
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
        for (int k = 0; k < coefficients.length; k++) {
            for (int i = k; i < coefficients[0].length; i++) {
                double max = coefficients[k][k];
                if (coefficients[i][k] > max){
                    double[] temp = coefficients[k];
                    coefficients[k] = coefficients[i];
                    coefficients[i] = temp;
                    double temp2 = independentTerms[k];
                    independentTerms[k] = independentTerms[i];
                    independentTerms[i] = temp2;
                }
            }
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
    public double[] exercise6(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        for (int k = 0; k < coefficients.length; k++) {
            double diagonal = coefficients[k][k];
            for (int j = k; j < coefficients[0].length; j++)
                coefficients[k][j] = calculator.division(coefficients[k][j], diagonal);
            independentTerms[k] = calculator.division(independentTerms[k], diagonal);
            if (k+1 < coefficients.length){
                int i = k+1;
                double multiplier = coefficients[i][k];
                for (int l = k; l < coefficients[0].length; l++)
                    coefficients[i][l] = calculator.subtraction(coefficients[i][l], calculator.multiplication(multiplier, coefficients[k][l]));
                independentTerms[i] = calculator.subtraction(independentTerms[i], calculator.multiplication(multiplier, independentTerms[k]));
            }
        }
        return exercise1(coefficients, independentTerms);
    }

    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        return new double[0];
    }

    @Override
    public double[][] exercise8(double[][] coefficients) {
        double[][] identity = new double[coefficients.length][coefficients.length];

        for(int i = 0; i < identity.length; i++){
            for (int j = 0; j < identity.length; j++){
                if(i == j) identity[i][j] = 1;
                else identity[i][j] = 0;
            }
        }

        double[][] extendedMat = extend(coefficients,identity);

        for(int k = 0; k < extendedMat.length; k++){

            double pivotA = extendedMat[k][k];

            for(int j = k; j < extendedMat[0].length; j++){
                extendedMat[k][j] = extendedMat[k][j]/pivotA;
            }

            for(int i = 0; i < extendedMat.length; i++){
                if(i != k){
                    double pivotB = extendedMat[i][k];

                    for(int j = k; j < extendedMat[0].length; j++){
                        extendedMat[i][j] = extendedMat[i][j] - (pivotB * extendedMat[k][j]);
                    }
                }
            }
        }

        double[][] result = new double[extendedMat.length][extendedMat.length];

        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result.length; j++){
                result[i][j] = extendedMat[i][coefficients.length+j];
            }
        }

        return result;
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

    public double[][] extend(double[][] coefficients, double[] independentTerms){
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

    public double[][] extend(double[][] coefficients, double[][] identity){
        double[][] extendedMat = new double[coefficients.length][coefficients.length + identity.length];

        for(int i = 0; i < coefficients.length; i++){
            for(int j = 0; j < coefficients.length; j++){
                extendedMat[i][j] = coefficients[i][j];
            }
        }

        for(int i = 0; i < extendedMat.length; i++){
            for (int j = 0; j < identity.length ; j++){
                extendedMat[i][coefficients.length+j] = identity[i][j];
            }
        }

        return extendedMat;
    }

}
