package ua.com.hometask.calendar.date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyDate {

    private long value;

    public MyDate(long value){
        this.value = value;
    }
}
