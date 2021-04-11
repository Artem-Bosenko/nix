package ua.com.hometask.console.window;

import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.calendar.services.impl.ConverterToMillisecondServiceImpl;
import ua.com.hometask.console.application.ConsoleInputApplication;
import ua.com.hometask.console.DateSequance;

public class StartWindow {

    private final ConverterToMillisecondServiceImpl service = new ConverterToMillisecondServiceImpl();

    public void run(){
        String inputSequence = ConsoleInputApplication.execute();
        int numberFormat = ConsoleInputApplication.getNumberFormat();
        DateSequance sequence = new DateSequance(inputSequence,numberFormat);

        long value = service.run(sequence);
        MyDate date = new MyDate(value);

        WindowDefinederOperation windowDefinederOperation = new WindowDefinederOperation(date,sequence);
        windowDefinederOperation.chooseArithmeticOrOutputInformation();

    }


}
