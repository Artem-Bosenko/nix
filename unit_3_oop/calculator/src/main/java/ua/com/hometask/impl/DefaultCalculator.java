package main.java.ua.com.hometask.impl;

import main.java.ua.com.hometask.Calculator;

@Deprecated
public class DefaultCalculator implements Calculator {

    public DefaultCalculator(){
        System.out.println("It's a default realization of calculator");
    }

    @Override
    public Number summary(double a, double b) {
        System.out.println(a + " + " + b);
        return a + b;
    }

    @Override
    public Number subtraction(double a, double b) {
        System.out.println(a + " - " + b);
        return a - b;
    }

    @Override
    public Number devide(double a, double b) {
        System.out.println(a + " / " + b);
        return a / b;
    }

    @Override
    public Number multiply(double a, double b) {
        System.out.println(a + " * " + b);
        return a * b;
    }

    @Override
    public Number modulDevide(int a, int b) {
        System.out.println(a + " mod(" + b + ")");
        return a%b;
    }
}
