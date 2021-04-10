package ua.com.hometask.console.application;

import ua.com.hometask.console.window.StartWindow;
import ua.com.hometask.controller.ClientController;


public class ConsoleApplication {

    private final ClientController clientController = new ClientController();
    private final StartWindow window = new StartWindow();

    public void run() {

        System.out.println("Please, press Enter!");

        String answer;
        while ((answer = clientController.read()) != null) {

            window.run();
            answer = clientController.read();
            switch (answer) {
                case "0": {
                    System.exit(0);
                    break;
                }
                case "1": {
                    window.run();
                    break;
                }
                default: throw new RuntimeException("Invalid command");

            }

        }

    }

}
