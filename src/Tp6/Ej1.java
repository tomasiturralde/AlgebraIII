package Tp6;

/**
 * Created by Tomas on 9/5/2017.
 */
public class Ej1 {

    public int ejA(Matrix matrix){
        if (matrix.isSquare()) {
            int result = 0;
            for (int i = 0; i < matrix.rowLength(); i++) {
                result += matrix.getMat()[i][i];
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
                    result += matrix.getMat()[i][j];
                }
            }
            return result;
        }
        throw new RuntimeException("Invalid matrix, must be square");
    }

    public int[] ejC(Matrix matrix){
        if (matrix.isSquare()){
            int[] result = new int[matrix.rowLength()];

        }
        throw new RuntimeException("Invalid matrix, must be square");
    }
}
