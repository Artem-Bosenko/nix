package ua.com.module;

public class CustomDate {
    private final int day;
    private final int month;
    private final int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate(){
        String dayStr = String.valueOf(day);
        String monthStr = String.valueOf(month);
        if(dayStr.matches("[1-9]")) dayStr = "0"+day;
        if(monthStr.matches("[1-9]")) monthStr = "0"+month;

        return year+monthStr+dayStr;
    }
}
