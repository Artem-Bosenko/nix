package ua.com.hometask.calendar.services.impl;

import ua.com.hometask.calendar.services.ArithmeticCalendarService;
import ua.com.hometask.calendar.date.MyDate;

import static java.lang.Math.abs;

public class ArithmeticCalendarServiceImpl implements ArithmeticCalendarService {


    @Override
    public long different(MyDate firstDate , MyDate secondDate) {
        return abs(firstDate.getValue()-secondDate.getValue());
    }

    @Override
    public void addTime(MyDate date, long time) {
        date.setValue(date.getValue()+time);
    }

    @Override
    public void subtractTime(MyDate date, long time) {
        date.setValue(date.getValue()-time);
    }

    @Override
    public boolean compareDate(MyDate firstDate, MyDate secondDate, String comparator) {
        switch (comparator){
            case "<": return firstDate.getValue() < secondDate.getValue();
            case ">": return firstDate.getValue() > secondDate.getValue();
            case "==": return firstDate.getValue() == secondDate.getValue();
            default: throw new RuntimeException("Invalid comparator");
        }
    }
}
