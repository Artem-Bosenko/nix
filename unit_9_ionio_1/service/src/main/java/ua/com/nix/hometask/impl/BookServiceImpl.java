package ua.com.nix.hometask.impl;

import ua.com.nix.hometask.Book;
import ua.com.nix.hometask.BookDao;
import ua.com.nix.hometask.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookDao bookDao = new BookDaoImpl();

    @Override
    public void create(Book book) {
        bookDao.create(book);
    }

    @Override
    public Book read(int id) {
        return bookDao.read(id);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public void delete(int id) {
        bookDao.delete(id);
    }

    @Override
    public List<Book> findByAuthor(int author) {
        return bookDao.findByAuthor(author);
    }

    public Book findBookByTitle(String title){
        return bookDao.findBookByTitle(title);
    }

    public boolean isBookByTitleExist(String title){
        return bookDao.isBookByTitleExist(title);
    }
}
