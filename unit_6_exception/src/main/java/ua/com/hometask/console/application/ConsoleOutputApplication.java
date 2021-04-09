package ua.com.hometask.console.application;

import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.console.ClassForChooseFormat;
import ua.com.hometask.console.DateSequance;
import ua.com.hometask.controller.FormatOutputController;

public class ConsoleOutputApplication {
    private final FormatOutputController outputController;
    private final ClassForChooseFormat chooseFormat = new ClassForChooseFormat();

    public ConsoleOutputApplication(MyDate date, DateSequance dateSequance){

        outputController = new FormatOutputController(date, dateSequance);
    }

    public void execute(){
        outputController.execute(chooseFormat.chooseFormat());
        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }
}
