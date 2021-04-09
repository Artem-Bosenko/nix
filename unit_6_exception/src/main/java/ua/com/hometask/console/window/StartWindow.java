package ua.com.hometask.console.window;

import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.calendar.services.impl.ConverterToMillisecondServiceImpl;
import ua.com.hometask.console.application.ConsoleInputApplication;
import ua.com.hometask.console.application.ConsoleOutputApplication;
import ua.com.hometask.console.DateSequance;

public class StartWindow {

    private final ConverterToMillisecondServiceImpl service = new ConverterToMillisecondServiceImpl();

    public void run(){
        String inputSequence = ConsoleInputApplication.execute();

        DateSequance sequence = new DateSequance(inputSequence);

        long value = service.run(sequence);

        MyDate date = new MyDate(value);

        ConsoleOutputApplication consoleOutputApplication = new ConsoleOutputApplication(date, sequence);

        consoleOutputApplication.execute();
    }
}
