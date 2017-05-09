package Tp6;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 09/05/2017.
 */
public class Ej2 {

    public boolean isSimmetrical(Matrix matrix){
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
    }
}
