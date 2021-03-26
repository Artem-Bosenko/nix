package ua.com.hometask.impl;

import ua.com.hometask.Author;
import ua.com.hometask.BaseTypeService;
import ua.com.hometask.DataBase;

import java.util.List;

public class AuthorServiceImpl implements BaseTypeService<Author> {

    private final DataBase dataBase = DataBase.getInstance();

    @Override
    public void create(Author author) {
        dataBase.createAuthor(author);
    }

    @Override
    public void read(Author author) {
        dataBase.readAuthor(author);
    }

    @Override
    public void update(Author author) {
        dataBase.updateAuthor(author);
    }

    @Override
    public void delete(int id) {
        dataBase.deleteAuthor(id);
    }

    @Override
    public List<Author> findAllByParameter(String param) {
        return dataBase.getAuthorsByBook(param);
    }
}
