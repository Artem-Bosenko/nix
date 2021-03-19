package main.java.ua.com.hometask.impl;

import main.java.ua.com.hometask.Calculator;

import java.math.BigDecimal;
import java.math.BigInteger;


public class CalculatorWithAnimation implements Calculator {

    public CalculatorWithAnimation(){
        System.out.println("It's a new super realization of calculator with graphic!");
    }
    @Override
    public BigDecimal summary(BigDecimal a, BigDecimal b) {
        System.out.println("Summary:\n" + a + " + " + b);
        return a.add(b);
    }

    @Override
    public BigDecimal subtraction(BigDecimal a, BigDecimal b) {
        System.out.println("Subtraction:\n" +a + " - " + b);
        return a.subtract(b);
    }

    @Override
    public BigDecimal devide(BigDecimal a, BigDecimal b) {
        System.out.println("Devision:\n" +a + " / " + b);
        return a.setScale(6).divide(b,BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        System.out.println("Multiply:\n" +a + " * " + b);
        return a.multiply(b);
    }

    @Override
    public BigDecimal modulDevide(BigInteger a, BigInteger b) {
        System.out.println("Remainder of division:\n" +a + " mod(" + b + ")");
        return new BigDecimal(a.mod(b).toString());
    }
}
