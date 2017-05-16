package Tp6;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 09/05/2017.
 */
public class Ej2 implements Exercise2{


    @Override
    public boolean exerciseA(double[][] matrix, Calculator calculator) {
        boolean answer = true;

        if(matrix.length == matrix[0].length){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; i < matrix[0].length; j++){
                    if(i == j) continue;

                    if(matrix[i][j] != matrix[j][i]) answer = false;
                }
            }

            return answer;
        }

        throw new RuntimeException("Invalid matrix. Must be square.");
    }

    @Override
    public boolean exerciseB(double[][] matrix, Calculator calculator) {
        double sum = 0;

        if(matrix.length == matrix[0].length){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; i < matrix[0].length; j++){
                    if(i == j) continue;

                    sum = calculator.sum(sum, matrix[i][j]);
                    sum = calculator.sum(sum, matrix[j][i]);
                }
            }

            for(int i = 0; i < matrix.length; i++){
                int j = 0;

                while(j < i){
                    j++;
                }

                if(sum >= matrix[i][j]) return false;
            }

            return true;
        }

        throw new RuntimeException("Invalid matrix. Must be square.");
    }

    /*public boolean isSimmetrical(Matrix matrix){
        boolean answer = true;

        if(matrix.isSquare()){
            for(int i = 0; i < matrix.rowLength(); i++){
                for(int j = 0; i < matrix.colLength(); j++){
                    if(i == j) continue;

                    if(matrix.getAt(i,j) != matrix.getAt(j,i)) answer = false;
                }
            }

            return answer;
        }

        throw new RuntimeException("Invalid matrix. Must be square.");
    }

    public boolean isDiagDominant(Matrix matrix){
        int sum = 0;

        if(matrix.isSquare()){
            for(int i = 0; i < matrix.rowLength(); i++){
                for(int j = 0; i < matrix.colLength(); j++){
                    if(i == j) continue;

                    sum += matrix.getAt(i,j);
                    sum += matrix.getAt(j,i);
                }
            }

            for(int i = 0; i < matrix.rowLength(); i++){
                int j = 0;

                while(j < i){
                    j++;
                }

                if(sum >= matrix.getAt(i,j)) return false;
            }

            return true;
        }

        throw new RuntimeException("Invalid matrix. Must be square.");
    }*/
}
