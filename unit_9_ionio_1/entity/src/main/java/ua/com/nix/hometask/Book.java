package ua.com.nix.hometask;

import lombok.Getter;
import lombok.Setter;
import sun.reflect.generics.tree.BaseType;
import ua.com.nix.hometask.impl.AuthorServiceImpl;
import ua.com.nix.hometask.impl.BookServiceImpl;

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
        AuthorServiceImpl service = new AuthorServiceImpl();
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer author : idAuthorsList){
            Author author1 = service.findByID(author);
            stringBuilder.append(author1.getFirstName() + " " + author1.getLastName() + " ");
        }

        return "Book: ⟪" + title + "⟫ . Authors: " + stringBuilder.toString() ;
    }
}
