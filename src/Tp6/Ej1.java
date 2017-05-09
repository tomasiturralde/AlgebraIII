package Tp6;

/**
 * Created by Tomas on 9/5/2017.
 */
public class Ej1 {

    public int ejA(Matrix matrix){
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
    }
}
