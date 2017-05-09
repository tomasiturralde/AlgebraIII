package Tp6;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 09/05/2017.
 */
public class Matrix {
    private int rows;
    private int cols;
    private int[][] mat;

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

    public int getAt(int row, int col){
        if(row < 0 || row >= rows) throw new RuntimeException("Row " + row + "does not  exist");
        if(col < 0 || row >= cols) throw new RuntimeException("Col " + col + "does not  exist");

        return mat[row][col];
    }

    public boolean isSquared(){
        return rows == cols;
    }

    public void print(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int rowLength(){
        return mat.length;
    }

    public int colLength(){
        return mat[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
