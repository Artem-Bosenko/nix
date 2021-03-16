package main.java.ua.com.hometask.calculator_impl;

import main.java.ua.com.hometask.Calculator;
import main.java.ua.com.hometask.factory.CalculatorFactory;

public class CalculatorObj {

    private final Calculator calculator = CalculatorFactory.getInstance().getCalculator();

    public void init(){
        int a = 5, b = 5;
        System.out.println(calculator.devide(a,b));
    }
}
