package Tp6;

import Tp6.CalculatoImpl;
import Tp6.Ej3;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 21/05/2017.
 */
public class Ej3Test {

    @Test
    public void exerciseAI() throws Exception {
        double[][] matrix2 = {{2,2,2},
                {0,2,2},
                {0,0,2}};

        double[] vector = {1,1,1};
        Ej3 ej3 = new Ej3();

        double[] result = ej3.exerciseAI(matrix2,vector, new CalculatoImpl());

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    @Test
    public void exerciseAII() throws Exception {
        double[][] matrix2 = {{2,2,2},
                              {0,2,2},
                              {0,0,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseAII(matrix2,matrix2, new CalculatoImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseAIII() throws Exception {
        double[][] matrix2 = {{2,2,2},
                              {0,2,2},
                              {0,0,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseAIII(matrix2,matrix2, new CalculatoImpl());

        ej3.print(result);
    }

    @Test
    public void exerciseBI() throws Exception {

    }

    @Test
    public void exerciseBII() throws Exception {
    }

    @Test
    public void exerciseBIII() throws Exception {
        double[][] matrix2 = {{2,2,2,2},
                {2,2,2,2},
                {0,2,2,2},
                {0,0,2,2}};

        Ej3 ej3 = new Ej3();

        double[][] result = ej3.exerciseBIII(matrix2,matrix2, new CalculatoImpl());

        ej3.print(result);
    }
}