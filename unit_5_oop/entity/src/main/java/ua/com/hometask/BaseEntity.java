package ua.com.hometask;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseEntity {

    private int id;
    private Date dateOfCreated;
    private Type type;

    public BaseEntity(){
        ++id;
        dateOfCreated = new Date();
    }
}
