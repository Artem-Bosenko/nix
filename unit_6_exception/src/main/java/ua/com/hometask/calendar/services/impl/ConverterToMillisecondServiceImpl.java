package ua.com.hometask.calendar.services.impl;


import ua.com.hometask.calendar.services.ConverterToMillisecondService;
import ua.com.hometask.calendar.utils.DetermineLeapYearUtil;
import ua.com.hometask.console.DateSequance;


public class ConverterToMillisecondServiceImpl implements ConverterToMillisecondService {

    private final int[] NUMBER_DAYS_IN_MONTH_NON_LEAP_YEAR = {31,28,31,30,31,30,31,31,30,31,30,31};
    private final int[] NUMBER_DAYS_IN_MONTH_LEAP_YEAR = {31,29,31,30,31,30,31,31,30,31,30,31};

    @Override
    public long run(DateSequance date) {

        date.execute();

        int numNonLeapYears, numLeapYears;

        numLeapYears = numberLeapYearsBeforeYear(date.getDateStorage().getYear());
        numNonLeapYears = date.getDateStorage().getYear() - numLeapYears;

        if (DetermineLeapYearUtil.isLeapYear(date.getDateStorage().getYear())) {
            return (((numLeapYears-1) * 366L + numNonLeapYears*365L + getNumDaysForMonthes(date.getDateStorage().getMonth()-2,NUMBER_DAYS_IN_MONTH_LEAP_YEAR) + date.getDateStorage().getDay()-1)*86400000L) + (((date.getDateStorage().getHours()-1)* 3600L + (date.getDateStorage().getMinutes()-1)* 60L + date.getDateStorage().getSeconds()-1) * 1000);
        } else return  ((numLeapYears * 366L + (numNonLeapYears-1)*365L + getNumDaysForMonthes(date.getDateStorage().getMonth()-2,NUMBER_DAYS_IN_MONTH_NON_LEAP_YEAR) + date.getDateStorage().getDay()-1)*86400000L) + (((date.getDateStorage().getHours()-1)* 3600L + (date.getDateStorage().getMinutes()-1)*60L + date.getDateStorage().getSeconds()-1) * 1000);
    }


    private int numberLeapYearsBeforeYear(int inputYear) {
        return (inputYear / 4) - (inputYear/100) + (inputYear/400);
    }

    private int getNumDaysForMonthes(int inputMonth, int[] numberOfDaysInMonthes){
        int result = 0;
        for (int i = 0; i< inputMonth; i++){
            result+=numberOfDaysInMonthes[i];
        }
        return result;
    }

}
