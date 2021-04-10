package ua.com.hometask.console.window;

import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.calendar.services.impl.ConverterToMillisecondServiceImpl;
import ua.com.hometask.console.application.ConsoleInputApplication;
import ua.com.hometask.console.application.ConsoleOutputApplication;
import ua.com.hometask.console.DateSequance;
import ua.com.hometask.console.application.arithmetic.ArithmeticApplication;

public class StartWindow {

    private final ConverterToMillisecondServiceImpl service = new ConverterToMillisecondServiceImpl();

    public void run(){
        String inputSequence = ConsoleInputApplication.execute();
        int numberFormat = ConsoleInputApplication.getNumberFormat();
        DateSequance sequence = new DateSequance(inputSequence,numberFormat);

        long value = service.run(sequence);
        MyDate date = new MyDate(value);

        ArithmeticApplication arithmeticApplication = new ArithmeticApplication(date);
        arithmeticApplication.showOperation();

        ConsoleOutputApplication consoleOutputApplication = new ConsoleOutputApplication(date, sequence);
        consoleOutputApplication.execute();
    }
}
