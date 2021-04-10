package ua.com.hometask.console.application.arithmetic;

import ua.com.hometask.calendar.arithmetic.ClassForAddTime;
import ua.com.hometask.calendar.arithmetic.ClassForCompareTwoDates;
import ua.com.hometask.calendar.arithmetic.ClassForFindDifferentTimeFromTwoDates;
import ua.com.hometask.calendar.arithmetic.ClassForSubtractTime;
import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.console.window.ArithmeticWindow;
import ua.com.hometask.controller.ClientController;

public class ArithmeticApplication {

    private final ClientController clientController = new ClientController();

    private final MyDate date;

    public ArithmeticApplication(MyDate date) {
        this.date = date;
    }

    public void showOperation(){
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
                default: throw new RuntimeException("Invalid command");

            }
        }
    }


}
