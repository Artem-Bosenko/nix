package ua.com.hometask.impl;

import org.apache.log4j.Logger;
import ua.com.hometask.Author;
import ua.com.hometask.BaseTypeService;
import ua.com.hometask.Book;
import ua.com.hometask.DataBase;

import java.util.List;

public class AuthorServiceImpl implements BaseTypeService<Author> {

    private final DataBase dataBase = DataBase.getInstance();
    private final Logger log = Logger.getLogger(AuthorServiceImpl.class);

    @Override
    public void create(Author author) {
        log.info("Start create Author: " + author.getFirstName() + " " + author.getLastName());
        if (dataBase.findAuthorByFirstNameAndLastName(author.getFirstName(), author.getLastName()) == null) {
            dataBase.createAuthor(author);
        } else log.error("Author also exist: " + author.getFirstName() + " " + author.getLastName());
        log.info("End create author. Operation successful");
    }

    @Override
    public void read(Author author) {
        log.info("Start read operation. Read info about: " + author.getFirstName() + " " + author.getLastName());
        if (dataBase.findAuthorByFirstNameAndLastName(author.getFirstName(), author.getLastName()) != null) {
            dataBase.readAuthor(author);
        } else log.error("Author: " + author.getFirstName() + " " + author.getLastName() + " Not found");
        log.info("End read info about author. Operation successful");
    }

    @Override
    public void readAll() {
        log.info("Start read info about all authors in our DataBase");
        dataBase.readAllAuthors();
        log.info("Operation successful");
    }

    @Override
    public void update(Author author) {

        log.info("Start update operation. Read info about: " + author.getFirstName() + " " + author.getLastName());
        if (dataBase.findAuthorByFirstNameAndLastName(author.getFirstName(), author.getLastName()) != null) {
            dataBase.updateAuthor(author);
        } else log.error("Author: " + author.getFirstName() + " " + author.getLastName() + " Not found");
        log.info("End update info about author. Operation successful");
    }

    @Override
    public void delete(int id) {

        log.info("Start delete operation. Delete author with id: " + id);
        if (dataBase.isAuthorIDExist(id)) {
            dataBase.deleteAuthor(id);
        } else log.error("Author with ID: " + id + " Not found");
        log.info("End update info about author. Operation successful");
    }

    @Override
    public List<Author> findAllByParameter(String param) {

        log.info("Start get authors by title of book operation");
        if (dataBase.findBookByTitle(param) != null) {
            log.info("Operation get authors by title of book ends successful");
            return dataBase.getAuthorsByBook(param);
        } else log.error("Book with title: " + param + " Not found");
        throw new RuntimeException("Not found book");
    }

    public Author findAuthorByFirstNameAndLastName(String firstName, String lastName) {
        log.info("Start get author by first and last name " + firstName + " " + lastName);
        if(dataBase.findAuthorByFirstNameAndLastName(firstName,lastName)!= null){
            log.info("Operation get authors by irst and last name successful");
            return dataBase.findAuthorByFirstNameAndLastName(firstName, lastName);
        }
        else log.error("Author: "+firstName + lastName + " not found");
        throw new RuntimeException("author not found");
    }

    public List<Author> findAll(){
        return dataBase.getAllAuthors();
    }
    public boolean isAuthorExist(Author author){
        return dataBase.isAuthorIDExist(author.getId());
    }
}
