package ua.com.hometask;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Book extends BaseEntity{

    private String title;
    private List<Author> authorList;

    public Book(){
        super();
        setType(Type.BOOK);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Author author : authorList){
            stringBuilder.append(author.getFirstName() + " " + author.getLastName() + " ");
        }

        return "Book: ⟪" + title + "⟫ . Authors: " + stringBuilder.toString() ;
    }
}
