package ua.com.hometask;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Author extends BaseEntity{

    private String firstName;
    private String lastName;
    private List<Book> bookList;

    public Author(){
        super();
        setType(Type.AUTHOR);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bookList=" + bookList.toString() +
                '}';
    }
}
