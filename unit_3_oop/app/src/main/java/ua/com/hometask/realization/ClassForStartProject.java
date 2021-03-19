package main.java.ua.com.hometask.realization;

import main.java.ua.com.hometask.Calculator;
import main.java.ua.com.hometask.ConsoleHelper;
import main.java.ua.com.hometask.factory.CalculatorFactory;
import main.java.ua.com.hometask.factory.ConsoleFactory;
import main.java.ua.com.hometask.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClassForStartProject {
    private static final ConsoleHelper consoleHelper = ConsoleFactory.getInstance().getConsoleHelper();
    private static final Calculator calculator = CalculatorFactory.getInstance().getCalculator();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void run(){
        String inputValue;
        consoleHelper.outputInf("Please press enter");
        while ((inputValue = consoleHelper.inputInf()) != null){
            start(inputValue);
            inputValue = consoleHelper.inputInf();
            switch (inputValue){
                case "0" : {
                    System.exit(0);
                    break;
                }
                case "1" : {
                    start(inputValue);
                    break;
                }
            }
        }
    }

    private static void start(String inputValue){
        consoleHelper.startWindow();
        Number left = null, right = null, result = null;

        inputValue = consoleHelper.inputInf();
        left = NumberDeterminate.numberType(inputValue);

        inputValue = consoleHelper.inputInf();
        right = NumberDeterminate.numberType(inputValue);

        consoleHelper.showOperations();

        inputValue = consoleHelper.inputInf();

        result = ClassForChooseOperation.chooseOperation(inputValue,calculator,left,right);

        consoleHelper.outputInf("Result of your operation = " + result);
        consoleHelper.outputInf("\n\nYour variant: if you want exit, please input 0, else, repeat and input 1");
    }

}
