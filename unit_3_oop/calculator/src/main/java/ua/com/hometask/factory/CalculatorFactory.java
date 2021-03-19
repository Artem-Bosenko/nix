package main.java.ua.com.hometask.factory;

import main.java.ua.com.hometask.Calculator;
import org.reflections.Reflections;

import java.util.Set;

public class CalculatorFactory {

    private static CalculatorFactory factory;
    private Reflections reflection;
    private Set<Class<? extends Calculator>> calculators;

    private CalculatorFactory(){
        reflection = new Reflections("main.java.ua.com.hometask");
        calculators = reflection.getSubTypesOf(Calculator.class);
    }

    public static CalculatorFactory getInstance(){

        if(factory ==null){
            factory = new CalculatorFactory();
        }
        return factory;
    }

    public Calculator getCalculator(){
        for (Class<? extends Calculator> calculator : calculators) {
            if(!calculator.isAnnotationPresent(Deprecated.class)){
                try {
                    return calculator.getDeclaredConstructor().newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("Vse propalo");
                }
            }
        }
            throw new RuntimeException("Vse propalo");
    }
}
