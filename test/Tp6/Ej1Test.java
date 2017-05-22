package Tp6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 21/05/2017.
 */
public class Ej1Test {
    @Test
    public void exerciseF() throws Exception {

        double[][] matrix1 = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};

        double[][] matrix2 = {{2,2,2,2},
                {2,2,2,2},
                {2,2,2,2},
                {2,2,2,2}};

        Ej1 ej1 = new Ej1();
        Ej3 ej3 = new Ej3();

        double[][] result = ej1.exerciseF(matrix1,matrix2, new CalculatoImpl());

        ej3.print(result);
    }

}