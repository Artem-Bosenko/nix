package ua.com.hometask.impl;


import org.apache.log4j.Logger;
import ua.com.hometask.BaseTypeService;
import ua.com.hometask.Book;
import ua.com.hometask.DataBase;


import java.util.List;

public class BookServiceImpl implements BaseTypeService<Book> {

    private final DataBase dataBase = DataBase.getInstance();
    private final Logger log = Logger.getLogger(BookServiceImpl.class);

    @Override
    public void create(Book book) {
        log.info("Start create book: " + book.getTitle());
        if (dataBase.findBookByTitle(book.getTitle()) == null) {
            dataBase.createBook(book);
        } else log.error("Book also exist: " + book.getTitle());
        log.info("End create author. Operation successful");
    }

    @Override
    public void read(Book book) {

        log.info("Start read operation. Read info about: " + book.getTitle());
        if (dataBase.findBookByTitle(book.getTitle()) != null) {
            dataBase.readBook(book);
        } else log.error("Book: " + book.getTitle() + " Not found");
        log.info("End read info about book. Operation successful");
    }

    @Override
    public void readAll() {
        log.info("Start read info about all books in our DataBase");
        dataBase.readAllBooks();
        log.info("Operation successful");
    }

    @Override
    public void update(Book book) {

        log.info("Start update operation. Read info about: " + book.getTitle());
        if (dataBase.findBookByTitle(book.getTitle()) != null) {
            dataBase.updateBook(book);
        } else log.error("Book: " + book.getTitle() + " Not found");
        log.info("End update info about book. Operation successful");

    }

    @Override
    public void delete(int id) {


        log.info("Start delete operation. Delete author with id: " + id);
        if (dataBase.isBookIDExist(id)) {
            dataBase.deleteBook(id);
        } else log.error("Book with ID: " + id + " Not found");
        log.info("End update info about book. Operation successful");
    }

    @Override
    public List<Book> findAllByParameter(String param) {

        log.info("Start get books by last name authors of book operation");
        if (dataBase.findAuthorByLatName(param) != null) {
            log.info("Operation get authors by title of book ends successful");
            return dataBase.getBooksByAuthor(param);
        } else log.error("Author with last name: " + param + " Not found");
        throw new RuntimeException("Not found author");
    }

    public Book findBookByTitle(String title) {

        log.info("Start get book by title " + title);
        if(dataBase.findBookByTitle(title)!= null){
            log.info("Operation get authors by irst and last name successful");
            return dataBase.findBookByTitle(title);
        }
        else log.error("Book: "+title + " not found");
        throw new RuntimeException("author not found");
    }
}
