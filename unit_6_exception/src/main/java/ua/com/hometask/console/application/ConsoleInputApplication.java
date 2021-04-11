package ua.com.hometask.console.application;

import ua.com.hometask.console.ClassForChooseFormat;
import ua.com.hometask.controller.ClientController;
import ua.com.hometask.controller.FormatInputController;

public class ConsoleInputApplication {
    private static final ClientController clientController = new ClientController();
    private static final ClassForChooseFormat chooseFormat = new ClassForChooseFormat();
    private static final FormatInputController inputController = new FormatInputController();
    private static int numberFormat = 0;

    public static int getNumberFormat() {

        if (numberFormat != 0) return numberFormat;
        else {
            System.out.println("Sorry, but your input value was invalid. Repeat input");
            numberFormat = chooseFormat.chooseFormat();
            return numberFormat;
        }
    }

    public static String execute() {


        numberFormat = chooseFormat.chooseFormat();
        String regex = inputController.execute(numberFormat);

        clientController.output("Input your date");
        String read = clientController.read();

        if (read.matches(regex)) return read;
        else {
            System.out.println("Sorry, but your input invalid command. Repeat input");
            return execute();
        }
    }
}

