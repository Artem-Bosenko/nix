package ua.com.nix.hometask;

import lombok.Getter;
import lombok.Setter;



import java.util.List;


@Getter
@Setter
public class Author extends BaseEntity{

    private String firstName;
    private String lastName;
    private List<Integer> idBooks;


    public Author(){
        super();
        setType(Type.AUTHOR);
    }


}
