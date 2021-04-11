package ua.com.hometask.calendar.converts;

public class ConvertToDate {

    public static long[] execute(long value, boolean isLeapYear, int daysInMonth){
        long[] date = new long[7];

        Converter converter = new Converter(value, isLeapYear, daysInMonth);

        date[0] = converter.getYear();
        date[1] = converter.getMonth();
        date[2] = converter.getDay();
        date[3] = converter.getHour();
        date[4] = converter.getMinute();
        date[5] = converter.getSecond();
        date[6] = converter.getMillisecond();

        return date;
    }
}
