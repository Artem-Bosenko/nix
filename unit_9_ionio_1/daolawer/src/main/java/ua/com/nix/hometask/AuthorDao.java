package ua.com.nix.hometask;

import java.util.List;

public interface AuthorDao extends AbstractDao<Author>{

    List<Author> findByBook(int idBook);
    Author findAuthorByFirstNameAndLastName(String firstName, String lastName);
    boolean isAuthorExist(String firstName, String lastName);
}
