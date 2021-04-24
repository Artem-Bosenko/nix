package ua.com.nix.hometask.impl;

import ua.com.nix.hometask.Author;
import ua.com.nix.hometask.AuthorDao;
import ua.com.nix.hometask.AuthorService;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao = new AuthorDaoImpl();

    @Override
    public List<Author> findByBook(int book) {
        return authorDao.findByBook(book);
    }

    @Override
    public void create(Author author) {
        authorDao.create(author);
    }

    @Override
    public Author read(int id) {
        return authorDao.read(id);
    }

    @Override
    public void update(Author author) {
        authorDao.update(author);
    }

    @Override
    public void delete(int id) {
        authorDao.delete(id);
    }

    public Author findAuthorByFirstNameAndLastName(String firstName, String lastName){
        return authorDao.findAuthorByFirstNameAndLastName(firstName,lastName);
    }

    public boolean isAuthorExist(Author author){
        return authorDao.isAuthorExist(author.getFirstName(), author.getLastName());
    }
}
