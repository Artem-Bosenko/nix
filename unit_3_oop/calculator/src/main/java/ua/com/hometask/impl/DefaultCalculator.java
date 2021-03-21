package main.java.ua.com.hometask.impl;

import main.java.ua.com.hometask.Calculator;

import java.math.BigDecimal;
import java.math.BigInteger;


@Deprecated
public class DefaultCalculator implements Calculator {

    public DefaultCalculator(){
        System.out.println("It's a default realization of calculator");
    }

    @Override
    public BigDecimal summary(BigDecimal a, BigDecimal b) {
        System.out.println(a + " + " + b);
        return a.add(b);
    }

    @Override
    public BigDecimal subtraction(BigDecimal a, BigDecimal b) {
        System.out.println(a + " - " + b);
        return a.subtract(b);
    }

    @Override
    public BigDecimal devide(BigDecimal a, BigDecimal b) {
        System.out.println(a + " / " + b);
        return a.divide(b);
    }

    @Override
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        System.out.println(a + " * " + b);
        return a.multiply(b);
    }

    @Override
    public BigDecimal modulDevide(BigInteger a, BigInteger b) {
        System.out.println(a + " mod(" + b + ")");
        return new BigDecimal((a.mod(b)).toString());
    }
}
