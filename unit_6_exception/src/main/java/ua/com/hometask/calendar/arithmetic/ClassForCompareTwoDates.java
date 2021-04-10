package ua.com.hometask.calendar.arithmetic;

import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.calendar.services.impl.ArithmeticCalendarServiceImpl;
import ua.com.hometask.calendar.services.impl.ConverterToMillisecondServiceImpl;
import ua.com.hometask.console.DateSequance;
import ua.com.hometask.console.application.ConsoleInputApplication;
import ua.com.hometask.controller.ClientController;

public class ClassForCompareTwoDates {
    private final ClientController clientController = new ClientController();
    private final ArithmeticCalendarServiceImpl calendarService = new ArithmeticCalendarServiceImpl();
    private final ConverterToMillisecondServiceImpl service = new ConverterToMillisecondServiceImpl();
    private final MyDate date;

    public ClassForCompareTwoDates(MyDate date) {
        this.date = date;
    }

    public void execute(){
        String newFlow = ConsoleInputApplication.execute();
        int numberFormat = ConsoleInputApplication.getNumberFormat();
        DateSequance sequence = new DateSequance(newFlow, numberFormat);

        long value = service.run(sequence);
        MyDate newDate = new MyDate(value);

        clientController.output("Please, choose comparator");
        clientController.output(">\n<\n==");
        clientController.output("Your choice -> ");
        String comparator = clientController.read();
        boolean result = calendarService.compareDate(date, newDate, comparator);
        clientController.output("Result of your compare is " + result);
    }

}
