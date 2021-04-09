package ua.com.hometask.console;

import ua.com.hometask.controller.ClientController;

public class ClassForChooseFormat {
    private final ClientController clientController = new ClientController();

    public int chooseFormat(){
        clientController.output("Please choose format like example below:");
        clientController.output("1) 01/12/21 00:21:11:21\n2) 11/28/2021 00:21:11:21\n3) Март 4 21 00:21:11:21\n4) 09 Апрель 789 21:45:23:21");
        return Integer.parseInt(clientController.read());
    }
}
