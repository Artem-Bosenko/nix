package ua.com.hometask.calendar.arithmetic;

import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.calendar.services.impl.ArithmeticCalendarServiceImpl;
import ua.com.hometask.calendar.services.impl.ConverterToMillisecondServiceImpl;
import ua.com.hometask.console.DateSequance;
import ua.com.hometask.console.application.ConsoleInputApplication;
import ua.com.hometask.controller.ClientController;

public class ClassForFindDifferentTimeFromTwoDates {
    private final ClientController clientController = new ClientController();
    private final ArithmeticCalendarServiceImpl calendarService = new ArithmeticCalendarServiceImpl();
    private final ConverterToMillisecondServiceImpl service = new ConverterToMillisecondServiceImpl();

    private final MyDate date;

    public ClassForFindDifferentTimeFromTwoDates(MyDate date) {
        this.date = date;
    }

    public void execute() {

        String newFlow = ConsoleInputApplication.execute();
        int numberFormat = ConsoleInputApplication.getNumberFormat();
        DateSequance sequence = new DateSequance(newFlow, numberFormat);

        long value = service.run(sequence);
        MyDate newDate = new MyDate(value);

        long finalValueAfterDifferent = calendarService.different(date, newDate);

        clientController.output("What type of date do you want to take:");
        clientController.output("1)Years\n2)Days\n3)Hours\n4)Minutes\n5)Seconds\n6)Milliseconds");
        clientController.output("Your answer -> ");
        String answer = clientController.read();

        long res = defineTypeValueOfDifferentsDate(answer, finalValueAfterDifferent);
        clientController.output("Result = " + res);
    }

    private long defineTypeValueOfDifferentsDate(String s, long value) {
        switch (s) {
            case "1": {
                return value / 31536000000L;
            }
            case "2": {

                return value / 86400000L;
            }
            case "3": {

                return value / 3600000;
            }

            case "4": {

                return value / 60000;
            }
            case "5": {

                return value / 1000;
            }
            case "6": {
                return value;
            }
            default: throw new RuntimeException("Warning");
        }
    }
}
