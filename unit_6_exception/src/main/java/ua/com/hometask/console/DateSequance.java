package ua.com.hometask.console;

import ua.com.hometask.calendar.date.DateStorage;

public class DateSequance {

    private final String sequence;
    private final DateStorage dateStorage = new DateStorage();

    public DateSequance(String sequence) {
        this.sequence = sequence;
    }

    public DateStorage getDateStorage() {
        return dateStorage;
    }

    public void execute(){
        String[] mas = sequence.trim().split("[ /:]");

        if (!mas[0].equals("")) {
            dateStorage.setDay(Integer.parseInt(mas[0]));
        } else dateStorage.setDay(1);
        if (!mas[1].equals("")) {
            dateStorage.setMonth(Integer.parseInt(mas[1]));
        } else dateStorage.setMonth(1);
        if (!mas[2].equals("")) {
            dateStorage.setYear(Integer.parseInt(mas[2]));
        } else dateStorage.setYear(2021);
        if (!mas[3].equals("")) {
            dateStorage.setHours(Integer.parseInt(mas[3]));
        } else dateStorage.setHours(0);
        if (!mas[4].equals("")) {
            dateStorage.setMinutes(Integer.parseInt(mas[4]));
        } else dateStorage.setMinutes(0);
        if (!mas[5].equals("")) {
            dateStorage.setSeconds(Integer.parseInt(mas[5]));
        } else dateStorage.setSeconds(0);
        if (!mas[6].equals("")) {
            dateStorage.setMilliseconds(Integer.parseInt(mas[6]));
        } else dateStorage.setMilliseconds(0);
    }
}
