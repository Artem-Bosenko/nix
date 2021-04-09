package ua.com.hometask.calendar;

public interface FormatService {

    long convertToYears(long milliseconds, int numDays);
    long convertToMonths(long milliseconds, int numDays);
    long convertToDays(long milliseconds);
    long convertToHours(long milliseconds);
    long convertToMinutes(long milliseconds);
    long convertToSeconds(long milliseconds);
}
