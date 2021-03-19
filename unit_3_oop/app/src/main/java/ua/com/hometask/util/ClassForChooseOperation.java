package main.java.ua.com.hometask.util;

import main.java.ua.com.hometask.Calculator;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ClassForChooseOperation {

    public static BigDecimal chooseOperation(String str, Calculator calculator, Number left, Number right){
        BigDecimal result = null;

        switch (str){
            case "1":  result = new BigDecimal((calculator.summary(new BigDecimal(left.toString()), new BigDecimal(right.toString()))).toString());
                break;
            case "2": result = new BigDecimal((calculator.subtraction(new BigDecimal(left.toString()), new BigDecimal(right.toString()))).toString());
                break;
            case "3": result = new BigDecimal((calculator.devide(new BigDecimal(left.toString()), new BigDecimal(right.toString()))).toString());
                break;
            case "4": result = new BigDecimal((calculator.multiply(new BigDecimal(left.toString()), new BigDecimal(right.toString()))).toString());
                break;
            case "5": result = new BigDecimal((calculator.modulDevide(new BigInteger(left.toString()), new BigInteger(right.toString()))).toString());
                break;
            default: throw new RuntimeException("Invalid input value");
        }
        return result;
    }
}
