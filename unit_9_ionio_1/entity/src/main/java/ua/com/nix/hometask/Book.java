package ua.com.nix.hometask;

import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
public class Book extends BaseEntity{

    private String title;
    private List<Integer> idAuthorsList;

    public Book(){
        super();
        setType(Type.BOOK);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i: idAuthorsList) {
            stringBuilder.append(i).append(";");
        }
        return "Book: ⟪" + title + "⟫ . Authors: " + stringBuilder.toString() ;
    }
}
