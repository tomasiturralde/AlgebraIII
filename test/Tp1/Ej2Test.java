package Tp1;

import org.junit.Test;

import static Tp1.Ej2.mcd;
import static Tp1.Ej2.powOf2;
import static org.junit.Assert.*;

/**
 * Created by Lautaro Paskevicius (lautaro.paskevicius@ing.austral.edu.ar)
 * on 14/03/2017.
 */
public class Ej2Test {
    @Test
    public void factorialTest() throws Exception {

    }

    @Test
    public void powOf2Test() throws Exception {
        assertEquals(8,powOf2(3), 0.1);
    }

    @Test
    public void fibonacciTest() throws Exception {

    }

    @Test
    public void mcdTest() throws Exception {
        assertEquals(91, mcd(2366,273));

    }

}