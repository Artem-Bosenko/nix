package ua.com.nix.hometask;

import lombok.Getter;
import lombok.Setter;
import ua.com.nix.hometask.impl.BookServiceImpl;

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

    @Override
    public String toString() {
        BookServiceImpl service = new BookServiceImpl();
        StringBuilder stringBuilder = new StringBuilder();
        for (Book book : service.findAllByParameter(lastName)){
            if(book.getIdAuthorsList().stream().anyMatch(id->id.equals(getId()))) {
                stringBuilder.append("⟪" + book.getTitle() + "⟫ ");
            }
        }

        return "Author: " + firstName + " " + lastName + ". Books (" + stringBuilder.toString() + ")";
    }
}
