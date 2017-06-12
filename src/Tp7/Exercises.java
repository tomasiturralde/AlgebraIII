package Tp7;

/**
 * Implementations of every exercise in practice number 7.
 * @author Tomas Iturralde.
 * @author Lautaro Paskevicius.
 */
public class Exercises implements TP4 {

    /**
     * Solves an upper triangular matrix which has 1's in every value of the diagonal.
     * @param coefficients matrix to be solved.
     * @param independentTerms the number every equation inside the matrix must reach to.
     * @return the solution to every equation inside the matrix.
     */
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

    /**
     * Solves a lower triangular matrix which not necessarily has 1's in every value of the diagonal.
     * @param coefficients matrix to be solved.
     * @param independentTerms the number every equation inside the matrix must reach to.
     * @return the solution to every equation inside the matrix.
     */
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

    /**
     * Solves a matrix by applying the Gauss method to solve it (Without pivoteo).
     * @param coefficients matrix to be solved.
     * @param independentTerms the number every equation inside the matrix must reach to.
     * @return the solution to every equation inside the matrix.
     */
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

    /**
     * Solves a matrix by applying the Gauss method to solve it (Using partial pivoteo).
     * @param coefficients matrix to be solved.
     * @param independentTerms the number every equation inside the matrix must reach to.
     * @return the solution to every equation inside the matrix.
     */
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

    /**
     * Solves a Hessemberg matrix by applying the Gauss method to solve it.
     * @param coefficients Hessemberg matrix to be solved.
     * @param independentTerms the number every equation inside the matrix must reach to.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the solution to every equation inside the matrix.
     */
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

    /**
     * Implements the Gauss method to solve a tridiagonal and symmetric matrix.
     * @param coefficients matrix to be solved.
     * @param independentTerms the number every equation inside the matrix must reach to.
     * @param calculator used to do mathematical operations while having a counter for each time an operation has been done.
     * @return the solution to every equation inside the matrix.
     */
    @Override
    public double[] exercise7(double[][] coefficients, double[] independentTerms, Calculator calculator) {
        //First step
        coefficients[0][1] = calculator.division(coefficients[0][1],coefficients[0][0]);
        independentTerms[0] = calculator.division(independentTerms[0],coefficients[0][0]);

        for(int i = 1; i < coefficients.length-1; i++){
           coefficients[i][i+1] = calculator.division(coefficients[i][i+1],(calculator.subtraction(coefficients[i][i],calculator.multiplication(coefficients[i-1][i],coefficients[i][i-1]))));
           double num = calculator.subtraction(independentTerms[i],calculator.multiplication(independentTerms[i-1],coefficients[i][i-1]));
           double denom = calculator.subtraction(independentTerms[i],calculator.multiplication(coefficients[i-1][i],coefficients[i][i-1]));
           independentTerms[i] = calculator.division(num,denom);
        }

        //do extra step w/ independent terms (n)
        double num = calculator.subtraction(independentTerms[coefficients.length-1],calculator.multiplication(independentTerms[coefficients.length-1-1],coefficients[coefficients.length-1][coefficients.length-1-1]));
        double denom = calculator.subtraction(coefficients[coefficients.length-1][coefficients.length-1],calculator.multiplication(coefficients[coefficients.length-1-1][coefficients.length-1],coefficients[coefficients.length-1][coefficients.length-1-1]));
        double denom1 = coefficients[coefficients.length-1][coefficients.length-1] - coefficients[coefficients.length-1-1][coefficients.length-1] * coefficients[coefficients.length-1][coefficients.length-1-1];

        //Now, solve
        //N-term has already been assigned ( Xn = D'n)

        for(int i = coefficients.length-2; i >= 0; i--){
            independentTerms[i] = independentTerms[i] - coefficients[i][i+1] * independentTerms[i+1];
        }

        return independentTerms;
    }

    /**
     * Implements the Gauss-Jordan method to find the reverse matrix.
     * @param coefficients matrix to be reversed.
     * @return the reversed matrix.
     */
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

    /**
     * Implements the LU method to solve a matrix.
     * @param coefficients matrix to be solved.
     * @param independentTerms the number every equation inside the matrix must reach to.
     * @return the solution to every equation inside the matrix.
     */
    @Override
    public double[] exercise9(double[][] coefficients, double[] independentTerms) {
        double[][] UMatrix = new double[coefficients.length][coefficients[0].length];
        double[][] LMatrix = new double[coefficients.length][coefficients[0].length];
        for (int k = 0; k < coefficients.length; k++) {
            for (int j = k; j < coefficients.length; j++) {
                double u = 0;
                double l = 0;
                for (int p = 0; p < k; p++) {
                    u += LMatrix[k][p] * UMatrix[p][j];
                    l += LMatrix[j][p] * UMatrix[p][k];
                }
                UMatrix[k][j] = coefficients[k][j] - u;
                LMatrix[j][k] = (coefficients[j][k] - l) / UMatrix[k][k];
            }
        }
        double[] z = exercise2(LMatrix, independentTerms);
        return exercise5WithoutPivoteo(UMatrix, z);
    }

    /**
     * Prints a matrix.
     * @param mat matrix to be printed.
     */
    void print(double[][] mat){
        for(int i=0; i < mat.length; i++){
            for(int j=0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Extends a matrix by adding the independent terms inside it.
     * @param coefficients matrix which will be extended.
     * @param independentTerms which will go inside the extended matrix.
     * @return
     */
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
