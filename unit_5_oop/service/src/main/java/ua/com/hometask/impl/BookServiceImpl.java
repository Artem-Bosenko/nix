package ua.com.hometask.impl;


import ua.com.hometask.BaseTypeService;
import ua.com.hometask.Book;
import ua.com.hometask.DataBase;


import java.util.List;

public class BookServiceImpl implements BaseTypeService<Book> {

    private final DataBase dataBase = DataBase.getInstance();

    @Override
    public void create(Book book) {
        dataBase.createBook(book);
    }

    @Override
    public void read(Book book) {
        dataBase.readBook(book);
    }

    @Override
    public void update(Book book) {
        dataBase.updateBook(book);
    }

    @Override
    public void delete(int id) {
        dataBase.deleteBook(id);
    }

    @Override
    public List<Book> findAllByParameter(String param) {
        return dataBase.getBooksByAuthor(param);
    }
}
