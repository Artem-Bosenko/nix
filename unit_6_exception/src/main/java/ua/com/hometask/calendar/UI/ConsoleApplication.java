package ua.com.hometask.calendar.UI;

import ua.com.hometask.calendar.MyDate;
import ua.com.hometask.calendar.impl.ConverterToMillisecondServiceImpl;


public class ConsoleApplication {

    private final ClientController clientController = new ClientController();
    private long year, month, day, hour, minute, second;

    public void getDate() {

        clientController.output("Input your date");
        String inputSequence = clientController.read();
        ConverterToMillisecondServiceImpl service = new ConverterToMillisecondServiceImpl();
        long value = service.run(inputSequence);
        MyDate date = new MyDate(value);
        System.out.println(date.getValue());

        Converter converter = new Converter(date.getValue(), false, 31);
        year = converter.getYear();
        month = converter.getMonth();
        day = converter.getDay();
        hour = converter.getHour();
        minute = converter.getMinute();
        second = converter.getSecond();
        System.out.println(day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second);
    }
}
