package ua.com.hometask.calendar;

public interface ArithmeticCalendarService {

    long different(MyDate firstDate, MyDate secondDate);
    void addTime(MyDate date, long time);
    void subtractTime(MyDate date, long time);
    boolean compareDate(MyDate firstDate, MyDate secondDate, String comparator);

}
