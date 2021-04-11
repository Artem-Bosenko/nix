package ua.com.hometask.console.window;

import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.console.DateSequance;
import ua.com.hometask.console.application.ConsoleOutputApplication;
import ua.com.hometask.console.application.arithmetic.ArithmeticApplication;
import ua.com.hometask.controller.ClientController;

public class WindowDefinederOperation {

    private final ClientController controller = new ClientController();
    private final MyDate date;
    private final DateSequance sequence;

    public WindowDefinederOperation(MyDate date, DateSequance sequence){
        this.date = date;
        this.sequence = sequence;
    }

    public void chooseArithmeticOrOutputInformation(){
        controller.output("Please, input\n1 - to start show date operation\n2 - to start arithmetic operations");
        controller.output("Your choice -> ");
        String res = controller.read();
        definedOperation(res);
    }


    private void definedOperation(String s){

        switch (s){

            case "1": {
                ConsoleOutputApplication consoleOutputApplication = new ConsoleOutputApplication(date, sequence);
                consoleOutputApplication.execute();
                break;
            }
            case "2": {
                ArithmeticApplication arithmeticApplication = new ArithmeticApplication(date, sequence);
                arithmeticApplication.showOperation();
                break;
            }
            default: {
                controller.output("Sorry, but your input invalid command. Repeat input");
                chooseArithmeticOrOutputInformation();
                break;
            }
        }
    }
}
