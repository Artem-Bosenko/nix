package ua.com.hometask.console.application;

import ua.com.hometask.console.ClassForChooseFormat;
import ua.com.hometask.controller.ClientController;
import ua.com.hometask.controller.FormatInputController;

public class ConsoleInputApplication {
    private static final ClientController clientController = new ClientController();
    private static final ClassForChooseFormat chooseFormat = new ClassForChooseFormat();
    private static final FormatInputController inputController = new FormatInputController();

    public static String execute(){

        inputController.execute(chooseFormat.chooseFormat());

        clientController.output("Input your date");
        String read = clientController.read();

        return read;
    }
}
