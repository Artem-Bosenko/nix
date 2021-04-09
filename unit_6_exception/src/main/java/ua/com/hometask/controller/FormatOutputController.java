package ua.com.hometask.controller;

import ua.com.hometask.calendar.UI.Converter;
import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.calendar.utils.DetermineLeapYearUtil;
import ua.com.hometask.calendar.utils.DetermineNumberDaysInMonth;
import ua.com.hometask.calendar.utils.FindMonthNameForNumberMonth;
import ua.com.hometask.console.DateSequance;

public class FormatOutputController extends FormatController{

    private final long year, month, day, hour, minute, second, millisecond;
    private final Converter converter;
    private final ClientController clientController = new ClientController();

    public FormatOutputController(MyDate date, DateSequance dateSequance){

        boolean isLeapYear = DetermineLeapYearUtil.isLeapYear(dateSequance.getDateStorage().getYear());

        converter = new Converter(date.getValue(), isLeapYear, DetermineNumberDaysInMonth.numberOfDays(dateSequance.getDateStorage().getMonth(),isLeapYear));

        year = converter.getYear();
        month = converter.getMonth();
        day = converter.getDay();
        hour = converter.getHour();
        minute = converter.getMinute();
        second = converter.getSecond();
        millisecond = converter.getMillisecond();
    }

    @Override
    public void execute(int numberFormat) {
        switch (numberFormat){
            //1) 01/12/21 00:21:11:21
            case 1: {
                clientController.output(day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second+":"+millisecond);
                break;
            }
            //2) 11/28/2021 00:21:11:21
            case 2: {
                clientController.output(month + "/" + day + "/" + year + " " + hour + ":" + minute + ":" + second+":"+millisecond);
                break;
            }
            //3) Март 4 21 00:21:11:21
            case 3: {
                String monthSearch = FindMonthNameForNumberMonth.numberMonth((int) month);
                clientController.output(monthSearch + "/" + day + "/" + year + " " + hour + ":" + minute + ":" + second+":"+millisecond);
                break;
            }
            //4) 09 Апрель 789 21:45:23:21
            case 4: {
                String monthSearch = FindMonthNameForNumberMonth.numberMonth((int) month);
                clientController.output(day + "/" + monthSearch + "/" + year + " " + hour + ":" + minute + ":" + second+":"+millisecond);
                break;
            }
        }
    }
}
