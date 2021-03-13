package main.java.consoleUse;

import main.java.tasks.Calculation;
import main.java.tasks.SymbolCalculation;
import main.java.tasks.TimeTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

    private final BufferedReader stringReader = new BufferedReader(new InputStreamReader(System.in));

    private void firstTask() {
        String taskString = "";

        System.out.println("\nFirst task:");
        System.out.print("Input string for task 1 ");

        try {
            taskString = stringReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        sumNumberOfFigure(taskString);
    }

    private void sumNumberOfFigure(String taskString){
        int calculation, yourChoice = 0;
        Calculation calc = new Calculation();

        System.out.print("\nDo you want to find:\n1. sum of Number(Цифр)\n2. sum of Figure(Чисел)\n3. Exit in main menu\nYour choice ->");
        try {
            do {
                yourChoice = Integer.parseInt(stringReader.readLine());
            } while (yourChoice < 1 || yourChoice > 3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (yourChoice) {
            case 1:
                calculation = calc.sumOfNumbersInLine(taskString);
                System.out.println("\ncalculation of Number(Цифр) = " + calculation);
                break;
            case 2:
                calculation = calc.sumOfFigureInLine(taskString);
                System.out.println("\ncalculation of Figure(Чисел) = " + calculation);
                break;
            case 3:
                run();
                break;
        }
        sumNumberOfFigure(taskString);
    }

    private void secondTask() {

        System.out.println("\nSecond task:");
        System.out.print("Input string for task 2 ");
        String taskString = "";
        try {
            taskString = stringReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SymbolCalculation.calculationSymbol(taskString);
        run();
    }

    private void thirdTask() {

        System.out.println("\nThird task:");
        System.out.print("Input lesson number ");
        int inputLesson = 1;

        try {
            do {
                inputLesson = Integer.parseInt(stringReader.readLine());
            } while (inputLesson < 1 || inputLesson > 10);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TimeTable.timeEndLesson(inputLesson);
        run();
    }

    private void exit() {

        System.out.println("Good Bye)");
        System.exit(0);
    }

    public void run() {

        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.print("Input task number:\n1. Task for calculation sum number\n2. Task for summary symbol in line\n3. Time of end your lesson\n4. Exit\nYour choice is ->");

        int searchTask = 0;
        try {
            do {
                searchTask = Integer.parseInt(stringReader.readLine());
            } while (searchTask < 1 || searchTask > 4);
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (searchTask) {

            case 1:
                firstTask();
                break;
            case 2:
                secondTask();
                break;
            case 3:
                thirdTask();
                break;
            case 4:
                exit();
                break;
        }


    }
}
