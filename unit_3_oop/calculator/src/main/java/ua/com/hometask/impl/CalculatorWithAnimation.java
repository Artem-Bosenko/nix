package main.java.ua.com.hometask.impl;

import main.java.ua.com.hometask.Calculator;

public class CalculatorWithAnimation implements Calculator {

    public CalculatorWithAnimation(){
        System.out.println("It's a new super realization of calculator with graphic!");
    }
    @Override
    public Number summary(double a, double b) {
        System.out.println("Summary:\n" + a + " + " + b);
        return a + b;
    }

    @Override
    public Number subtraction(double a, double b) {
        System.out.println("Subtraction:\n" +a + " - " + b);
        return a - b;
    }

    @Override
    public Number devide(double a, double b) {
        System.out.println("Devision:\n" +a + " / " + b);
        return a / b;
    }

    @Override
    public Number multiply(double a, double b) {
        System.out.println("Multiply:\n" +a + " * " + b);
        return a * b;
    }

    @Override
    public Number modulDevide(int a, int b) {
        System.out.println("Remainder of division:\n" +a + " mod(" + b + ")");
        return a%b;
    }
}
