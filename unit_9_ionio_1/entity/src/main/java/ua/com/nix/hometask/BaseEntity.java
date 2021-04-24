package ua.com.nix.hometask;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseEntity {

    private int id;
    private Date dateOfCreated;
    private Type type;
    private boolean visible;

    public BaseEntity(){
        dateOfCreated = new Date();
        visible = true;
    }

}
