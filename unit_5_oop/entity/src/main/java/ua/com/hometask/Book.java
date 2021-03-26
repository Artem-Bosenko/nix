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
        return "Book{" +
                "title='" + title + '\'' +
                ", authorList=" + authorList.toString() +
                '}';
    }
}
