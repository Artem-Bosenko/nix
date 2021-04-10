package ua.com.hometask.calendar.arithmetic;

import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.calendar.services.impl.ArithmeticCalendarServiceImpl;
import ua.com.hometask.controller.ClientController;

public class ClassForSubtractTime {

    private final ClientController clientController = new ClientController();
    private final ArithmeticCalendarServiceImpl calendarService = new ArithmeticCalendarServiceImpl();
    private final MyDate date;

    public ClassForSubtractTime(MyDate date) {
        this.date = date;
    }

    public void execute() {
        clientController.output("What do you want to subtract from the current date:");
        clientController.output("1)Years\n2)Days\n3)Hours\n4)Minutes\n5)Seconds\n6)Milliseconds");
        clientController.output("Your answer -> ");
        String answer = clientController.read();
        clientController.output("Input your value:");
        long value = Long.parseLong(clientController.read());
        defineTypeValueOfDate(answer, value);
    }

    private void defineTypeValueOfDate(String s, long value) {
        switch (s) {
            case "1": {
                long finishValue = value * 31536000000L;
                calendarService.subtractTime(date, finishValue);
            }
            ;
            break;
            case "2": {
                long finishValue = value * 86400000L;
                calendarService.subtractTime(date, finishValue);
            }
            ;
            break;
            case "3": {
                long finishValue = value * 3600000;
                calendarService.subtractTime(date, finishValue);
            }
            ;
            break;
            case "4": {
                long finishValue = value * 60000;
                calendarService.subtractTime(date, finishValue);
            }
            ;
            break;
            case "5": {
                long finishValue = value * 1000;
                calendarService.subtractTime(date, finishValue);
            }
            ;
            break;
            case "6": {
                calendarService.subtractTime(date, value);
            }
            ;
            break;
        }
    }
}
