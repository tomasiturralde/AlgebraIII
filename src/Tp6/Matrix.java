package Tp6;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 09/05/2017.
 */
public class Matrix {
    int rows;
    int cols;
    int[][] mat;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat[i][j] = 0;
            }
        }
    }

    public void insert(int val, int row, int col){
        mat[row][col] = val;
    }

    public boolean isSquared(){
        return rows == cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
