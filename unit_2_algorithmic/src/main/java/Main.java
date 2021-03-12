package main.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader stringReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input string for tasks (1 and 2) ");

        String taskString = "";
        try {
            taskString = stringReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nFirst task:");
        Calculation calc = new Calculation();
        int calculation = calc.sumOfNumbersInLine(taskString);
        System.out.println("calculation = " + calculation);

        System.out.println("\nSecond task:");
        SymbolCalculation.calculatioSymbol(taskString);

        System.out.println("\nThird task:");

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input lesson number ");

        int inputLesson = 1;


        try {
            do {
                inputLesson = Integer.parseInt(buf.readLine());
            } while (inputLesson < 1 || inputLesson > 10);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TimeTable.timeEndLesson(inputLesson);

    }
}
