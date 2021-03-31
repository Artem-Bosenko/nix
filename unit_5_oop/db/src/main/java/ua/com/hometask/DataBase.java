package ua.com.hometask;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DataBase {

    private static DataBase dataBase;
    private final List<Author> authors;
    private final List<Book> books;


    private DataBase() {

        authors = new LinkedList<>();
        books = new LinkedList<>();
    }

    public static DataBase getInstance() {
        if (dataBase == null) dataBase = new DataBase();

        return dataBase;
    }

    public void createAuthor(Author author) {
        authors.add(author);
    }

    public void readAuthor(Author author) {
        System.out.println(author.toString());
    }

    public void readAllAuthors() {
        for (Author author : authors) {
            System.out.println(author.toString());
        }
    }

    public void updateAuthor(Author author) {
        Author a = authors.stream().filter(au -> au.getId() == author.getId()).findFirst().orElse(null);
        if (a != null) {
            a.setFirstName(author.getFirstName());
            a.setLastName(author.getLastName());
            a.setBookList(author.getBookList());
        }else throw new RuntimeException("not found author");
    }

    public void deleteAuthor(int id) {
        Author author = authors.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
        if(author != null) authors.remove(author);
        else throw new RuntimeException("not found author");
    }

    public Author findAuthorByFirstNameAndLastName(String firstName, String lastName) {
        return authors.stream().filter(author -> author.getFirstName().equals(firstName) && author.getLastName().equals(lastName)).findFirst().orElse(null);
    }

    public List<Author> getAuthorsByBook(String title) {
        List<Author> a = new LinkedList<>();

        for (Author author : authors) {
            if (author.getBookList().stream().anyMatch(book -> book.getTitle().equals(title))) {
                a.add(author);
            }
        }
        return a;
    }

    public List<Author> getAllAuthors() {
        return authors.stream().collect(Collectors.toList());
    }

    public boolean isAuthorIDExist(int id){
        return authors.stream().anyMatch(author -> author.getId() == id);
    }

    public Author findAuthorByLatName(String lastName){
        return authors.stream().filter(author -> author.getLastName().equals(lastName)).findFirst().orElse(null);
    }

    public void createBook(Book book) {
        books.add(book);
    }

    public void readBook(Book book) {
        System.out.println(book.toString());
    }

    public void readAllBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void updateBook(Book book) {
        Book a = books.stream().filter(book1 -> book1.getId() == book.getId()).findFirst().orElse(null);
        a.setTitle(book.getTitle());
        a.setAuthorList(book.getAuthorList());
        a.setAuthorList(book.getAuthorList());
    }

    public void deleteBook(int id) {
        Book b = books.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
        if(b!= null) books.remove(b);
        else throw new RuntimeException("not found author");
    }

    public Book findBookByTitle(String title) {
        return books.stream().filter(b -> b.getTitle().equals(title)).findFirst().orElse(null);
    }

    public List<Book> getBooksByAuthor(String authorLastName) {

        List<Book> bookList = new LinkedList<>();

        for (Book book : books) {
            if (book.getAuthorList().stream().anyMatch(a -> a.getLastName().equals(authorLastName))) {
                bookList.add(book);
            }
        }
        return bookList;
    }
    public List<Book> getAllBooks() {
        return books.stream().collect(Collectors.toList());
    }
    public boolean isBookIDExist(int id){
        return books.stream().anyMatch(book -> book.getId() == id);
    }
}
