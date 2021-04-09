package ua.com.hometask.calendar.utils;

public class DetermineLeapYearUtil {

    public static boolean isLeapYear(int inputYear) {
        return inputYear % 4 == 0 && (inputYear % 100 != 0 || inputYear % 400 == 0);
    }
}
