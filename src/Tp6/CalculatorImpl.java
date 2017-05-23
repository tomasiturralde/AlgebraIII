package Tp6;

import Tp6.Interfaces.Calculator;

/**
 * Created by Tomas on 16/5/2017.
 */
public class CalculatorImpl implements Calculator {
    private int sum, subtraction, multiplication, division;

    public CalculatorImpl(){
        sum = subtraction = multiplication = division = 0;
    }

    public int getSum() {
        return sum;
    }
    public int getSubtraction() {
        return subtraction;
    }
    public int getMultiplication() {
        return multiplication;
    }
    public int getDivision() {
        return division;
    }

    @Override
    public double sum(double a, double b) {
        sum++;
        return a+b;
    }

    @Override
    public double subtraction(double a, double b) {
        subtraction++;
        return a-b;
    }

    @Override
    public double multiplication(double a, double b) {
        multiplication++;
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        division++;
        return a/b;
    }
}
