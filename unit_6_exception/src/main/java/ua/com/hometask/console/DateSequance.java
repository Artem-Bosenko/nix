package ua.com.hometask.console;

import ua.com.hometask.calendar.date.DateStorage;
import ua.com.hometask.calendar.utils.DateSequenceUtil;

public class DateSequance {

    private final String sequence;
    private final int numberFormat;
    private final DateStorage dateStorage = new DateStorage();

    public DateSequance(String sequence, int numberFormat) {
        this.sequence = sequence;
        this.numberFormat = numberFormat;
    }

    public DateStorage getDateStorage() {
        return dateStorage;
    }

    public void execute(){
        String[] mas = sequence.split("[ /:]");
        DateSequenceUtil.execute(numberFormat,mas,dateStorage);
    }
}
