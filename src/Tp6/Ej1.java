package Tp6;

/**
 * Created by Tomas on 9/5/2017.
 */
public class Ej1 implements Exercise1{

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
    public double[][] exerciseG(double[][] matrix, Calculator calculator) {
        double[][] result = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++)
                result[j][i] = matrix[i][j];
        }
        return result;
    }

    /*public int ejA(Matrix matrix){
        if (matrix.isSquare()) {
            int result = 0;
            for (int i = 0; i < matrix.rowLength(); i++) {
                result += matrix.getAt(i,i);
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    public int ejB(Matrix matrix){
        if (matrix.isSquare()){
            int result = 0;
            for (int i = 0; i < matrix.rowLength(); i++){
                for (int j = matrix.colLength(); j > 0; j--){
                    result += matrix.getAt(i,j);
                }
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    public int[] ejC(Matrix matrix){
        if (matrix.isSquare()){
            int[] result = new int[matrix.rowLength()];
            for (int i = 0; i < matrix.colLength(); i++){
                int resultToAdd = 0;
                for (int j = 0; j < matrix.rowLength(); j++){
                    resultToAdd += matrix.getAt(j,i);
                }
                result[i] = resultToAdd;
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    public int[] ejD(Matrix matrix, int[] vector){
        if (matrix.rowLength() == vector.length){
            int[] result = new int[matrix.rowLength()];
            for (int i = 0; i < matrix.colLength(); i++){
                int resultToAdd = 0;
                for (int j = 0; j < matrix.rowLength(); j++){
                    resultToAdd += matrix.getAt(j,i)*vector[j];
                }
                result[i] = resultToAdd;
            }
            return result;
        }
        throw new RuntimeException("The amount of columns in the matrix must be equal to the vector's length");
    }

    public Matrix ejE(Matrix matrixA, Matrix matrixB){
        if (matrixA.rowLength() == matrixB.rowLength() && matrixA.colLength() == matrixB.colLength()){
            Matrix sum = new Matrix(matrixA.rowLength(), matrixB.colLength());
            for (int i = 0; i < matrixA.rowLength(); i++){
                for (int j = 0; j < matrixB.colLength(); j++){
                    sum.insert(matrixA.getAt(i,j) + matrixB.getAt(i,j),i,j);
                }
            }
            return sum;
        }
        throw new RuntimeException("Both dimensions must be equal");
    }

    public Matrix ejF(Matrix matrixA, Matrix matrixB){
        if (matrixA.rowLength() == matrixB.colLength()){
            Matrix product = new Matrix(matrixA.colLength(), matrixB.rowLength());
            for (int k = 0; k < matrixB.rowLength(); k++) {
                for (int i = 0; i < matrixA.colLength(); i++) {
                    int resultToAdd = 0;
                    for (int j = 0; j < matrixA.rowLength(); j++) {
                        resultToAdd += matrixA.getAt(i,j)*matrixB.getAt(k,j);
                    }
                    product.insert(resultToAdd, i, k);
                }
            }
            return product;
        }
        throw new RuntimeException("The first matrix's columns must be equal to the second's rows");
    }*/
}
