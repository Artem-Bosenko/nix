package ua.com.hometask.console.application.arithmetic;

import ua.com.hometask.calendar.arithmetic.ClassForAddTime;
import ua.com.hometask.calendar.arithmetic.ClassForCompareTwoDates;
import ua.com.hometask.calendar.arithmetic.ClassForFindDifferentTimeFromTwoDates;
import ua.com.hometask.calendar.arithmetic.ClassForSubtractTime;
import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.console.DateSequance;
import ua.com.hometask.console.application.ConsoleOutputApplication;
import ua.com.hometask.console.window.ArithmeticWindow;
import ua.com.hometask.console.window.StartWindow;
import ua.com.hometask.controller.ClientController;

public class ArithmeticApplication {

    private final ClientController clientController = new ClientController();

    private final MyDate date;
    private final DateSequance sequance;

    public ArithmeticApplication(MyDate date, DateSequance sequance) {
        this.date = date;
        this.sequance = sequance;
    }

    public void showOperation() {
        ArithmeticWindow arithmeticWindow = new ArithmeticWindow(date);
        System.out.println("Please, press Enter!");

        String answer;
        while ((answer = clientController.read()) != null) {

            arithmeticWindow.run();
            answer = clientController.read();
            switch (answer) {
                case "0": {
                    System.exit(0);
                    break;
                }
                case "1": {
                    arithmeticWindow.run();
                    break;
                }
                case "2": {
                    ConsoleOutputApplication window = new ConsoleOutputApplication(date, sequance);
                    window.execute();
                    break;
                }
                default: {
                    clientController.output("Sorry, but your input invalid command. Repeat input");
                    showOperation();
                    break;
                }
            }

        }
    }
}


