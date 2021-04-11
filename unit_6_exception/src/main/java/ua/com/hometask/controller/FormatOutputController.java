package ua.com.hometask.controller;

import ua.com.hometask.calendar.converts.ConvertToDate;
import ua.com.hometask.calendar.date.MyDate;
import ua.com.hometask.calendar.utils.DetermineLeapYearUtil;
import ua.com.hometask.calendar.utils.DetermineNumberDaysInMonth;
import ua.com.hometask.calendar.utils.FindMonthNameForNumberMonth;
import ua.com.hometask.console.ClassForChooseFormat;
import ua.com.hometask.console.DateSequance;


public class FormatOutputController extends FormatController {

    private final long[] data;


    public FormatOutputController(MyDate date, DateSequance dateSequance) {

        boolean isLeapYear = DetermineLeapYearUtil.isLeapYear(dateSequance.getDateStorage().getYear());
        data = ConvertToDate.execute(date.getValue(), isLeapYear, DetermineNumberDaysInMonth.numberOfDays(dateSequance.getDateStorage().getMonth(), isLeapYear));

    }

    @Override
    public String execute(int numberFormat) {
        switch (numberFormat) {
            //1) 01/12/21 00:21:11:21
            case 1: {
                return data[2] + "/" + data[1] + "/" + data[0] + " " + data[3] + ":" + data[4] + ":" + data[5] + ":" + data[6];

            }
            //2) 11/28/2021 00:21:11:21
            case 2: {
                return data[1] + "/" + data[2] + "/" + data[0] + " " + data[3] + ":" + data[4] + ":" + data[5] + ":" + data[6];

            }
            //3) Март 4 21 00:21:11:21
            case 3: {
                String monthSearch = FindMonthNameForNumberMonth.numberMonth((int) data[1]);
                return monthSearch + "/" + data[2] + "/" + data[0] + " " + data[3] + ":" + data[4] + ":" + data[5] + ":" + data[6];

            }
            //4) 09 Апрель 789 21:45:23:21
            case 4: {
                String monthSearch = FindMonthNameForNumberMonth.numberMonth((int) data[1]);
                return data[2] + "/" + monthSearch + "/" + data[0] + " " + data[3] + ":" + data[4] + ":" + data[5] + ":" + data[6];

            }
            default: {
                System.out.println("Sorry, but please output format again");
                ClassForChooseFormat chooseFormat = new ClassForChooseFormat();
                return execute(chooseFormat.chooseFormat());
            }
        }

    }
}
