package ua.com.hometask.console.window;

import ua.com.hometask.calendar.arithmetic.ClassForAddTime;
import ua.com.hometask.calendar.arithmetic.ClassForCompareTwoDates;
import ua.com.hometask.calendar.arithmetic.ClassForFindDifferentTimeFromTwoDates;
import ua.com.hometask.calendar.arithmetic.ClassForSubtractTime;
import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.controller.ClientController;

public class ArithmeticWindow {
    private final ClientController clientController = new ClientController();
    private final MyDate date;

    public ArithmeticWindow(MyDate date) {
        this.date = date;
    }

    public void run(){
        clientController.output("Please, choose operation");
        clientController.output("1) Different between your date and new date\n2) Add time to date\n3) Subtract time from date\n4) Compare your date and new date");
        clientController.output("Your choose ->");
        String choose = clientController.read();
        chooseOperation(choose);
    }

    private void chooseOperation(String s){

        switch (s){
            case "1": {
                ClassForFindDifferentTimeFromTwoDates differentTimeFromTwoDates = new ClassForFindDifferentTimeFromTwoDates(date);
                differentTimeFromTwoDates.execute();
                clientController.output("Your variant: if you want exit, please input 0, for repeat operation - input 1, to run start window output 2");
            };break;
            case "2": {
                ClassForAddTime addTime = new ClassForAddTime(date);
                addTime.execute();
                clientController.output("Your variant: if you want exit, please input 0, for repeat operation - input 1, to run start window output 2");
            };break;
            case "3": {
                ClassForSubtractTime subtractTime = new ClassForSubtractTime(date);
                subtractTime.execute();
                clientController.output("Your variant: if you want exit, please input 0, for repeat operation - input 1, to run start window output 2");
            };break;
            case "4": {
                ClassForCompareTwoDates compareTwoDates = new ClassForCompareTwoDates(date);
                compareTwoDates.execute();
                clientController.output("Your variant: if you want exit, please input 0, for repeat operation - input 1, to run start window output 2");
            };break;
            default:{
                clientController.output("Sorry, but your input invalid command. Repeat input");
                run();
            }

        }
    }
}
