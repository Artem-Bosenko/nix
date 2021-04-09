package ua.com.hometask.calendar.impl;

import ua.com.hometask.calendar.ConverterToMillisecondService;


public class ConverterToMillisecondServiceImpl implements ConverterToMillisecondService {
    private int year, month, day, hours, minutes, seconds, milliseconds;
    private final int[] NUMBER_DAYS_IN_MONTH_NON_LEAP_YEAR = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int[] NUMBER_DAYS_IN_MONTH_LEAP_YEAR = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    @Override
    public long run(String date) {

        int numNonLeapYears, numLeapYears;


        String[] mas = date.split("[ /:]");

        if (!mas[0].equals("")) {
            day = Integer.parseInt(mas[0]);
        } else day = 1;
        if (!mas[1].equals("")) {
            month = Integer.parseInt(mas[1]);
        } else month = 1;
        if (!mas[2].equals("")) {
            year = Integer.parseInt(mas[2]);
        } else year = 2021;
        if (!mas[3].equals("")) {
            hours = Integer.parseInt(mas[3]);
        } else hours = 0;
        if (!mas[4].equals("")) {
            minutes = Integer.parseInt(mas[4]);
        } else minutes = 0;
        if (!mas[5].equals("")) {
            seconds = Integer.parseInt(mas[5]);
        } else seconds = 0;
        if (!mas[6].equals("")) {
            milliseconds = Integer.parseInt(mas[6]);
        } else milliseconds = 0;

        numLeapYears = numberLeapYearsBeforeYear(year);
        numNonLeapYears = year - numLeapYears;

        if (isLeapYear(year)) {
            return (numLeapYears * 366L + numNonLeapYears * 365L + getNumDaysForMonthes(month - 1, NUMBER_DAYS_IN_MONTH_LEAP_YEAR) + day) * 86400000L + ((hours * 3600L + minutes + 60 + seconds) * 1000);
        } else
            return (numLeapYears * 366L + numNonLeapYears * 365L + getNumDaysForMonthes(month - 1, NUMBER_DAYS_IN_MONTH_NON_LEAP_YEAR) + day) * 86400000L + ((hours * 3600L + minutes + 60 + seconds) * 1000);
    }

    private boolean isLeapYear(int inputYear) {

        return inputYear % 100 != 0 && (inputYear % 100 == 0 && inputYear % 400 == 0);
    }

    private int numberLeapYearsBeforeYear(int inputYear) {
        return (year / 4) - (year / 100) + (year / 400);
    }

    private int getNumDaysForMonthes(int inputMonth, int[] numberOfDaysInMonthes) {
        int result = 0;
        for (int i = 0; i < inputMonth; i++) {
            result += numberOfDaysInMonthes[i];
        }
        return result;
    }

}
