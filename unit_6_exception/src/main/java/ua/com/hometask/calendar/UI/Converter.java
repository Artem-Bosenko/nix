package ua.com.hometask.calendar.UI;

import ua.com.hometask.calendar.impl.FormatServiceImpl;

public class Converter {
    private final FormatServiceImpl formatService = new FormatServiceImpl();
    private long value;
    private final int daysInYear;
    private final int daysInMonth;

    public Converter(long value, boolean isLeapYear, int daysInMonth){
        this.value = value;
        if(isLeapYear) daysInYear = 366;
        else daysInYear = 365;

        this.daysInMonth = daysInMonth;
    }

    public long getYear(){
        long result = formatService.convertToYears(value,daysInYear);
        value = value%(daysInYear* 86400000L);
        return result;
    }

    public long getMonth(){
        long result = formatService.convertToMonths(value,daysInMonth);
        value = value%(daysInMonth*86400000L);
        return result;
    }

    public long getDay(){
        long result =formatService.convertToDays(value);
        value = value%86400000;
        return result;
    }

    public long getHour(){
        long result =formatService.convertToHours(value);
        value = value%3600000;
        return result;
    }

    public long getMinute(){
        long result =formatService.convertToMinutes(value);
        value = value%60000;
        return result;
    }

    public long getSecond(){
        long result = formatService.convertToSeconds(value);
        value = value%1000;
        return result;
    }

}
