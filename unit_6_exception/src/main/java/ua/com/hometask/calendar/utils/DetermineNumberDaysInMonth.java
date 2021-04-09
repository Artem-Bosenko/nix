package ua.com.hometask.calendar.utils;

public class DetermineNumberDaysInMonth {
    public static int numberOfDays(int month, boolean isLeapYear){

        int index = month-1;
        int[] NUMBER_DAYS_IN_MONTH_NON_LEAP_YEAR = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] NUMBER_DAYS_IN_MONTH_LEAP_YEAR = {31,29,31,30,31,30,31,31,30,31,30,31};

        if(isLeapYear) return NUMBER_DAYS_IN_MONTH_LEAP_YEAR[index];
        else return NUMBER_DAYS_IN_MONTH_NON_LEAP_YEAR[index];
    }
}
