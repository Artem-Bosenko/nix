package ua.com.hometask;

import java.util.LinkedList;
import java.util.List;

public class DataBase {

    private static DataBase dataBase;
    private List<Author> authors;
    private List<Book> books;

    private DataBase(){
        authors = new LinkedList<>();
        books = new LinkedList<>();
    }

    public static DataBase getInstance(){
        if(dataBase == null) dataBase = new DataBase();

        return dataBase;
    }

    public void createAuthor(Author author){
        authors.add(author);
    }

    public void readAuthor(Author author){
        System.out.println(author.toString());
    }

    public void updateAuthor(Author author){
        Author a = authors.stream().filter(au-> au.getId()==author.getId()).findFirst().get();
        a.setFirstName(author.getFirstName());
        a.setLastName(author.getLastName());
        a.setBookList(author.getBookList());
    }

    public void deleteAuthor(int id){
        Author author = authors.stream().filter(a -> a.getId() == id).findFirst().get();
        authors.remove(author);
    }

    public List<Author> getAuthorsByBook(String title){
        List<Author> a = new LinkedList<>();

        for (Author author : authors) {
            if(author.getBookList().stream().anyMatch(book -> book.getTitle().equals(title))){
                a.add(author);
            }
        }
        return a;
    }


    public void createBook(Book book){
        books.add(book);
    }

    public void readBook(Book book){
        System.out.println(book.toString());
    }

    public void updateBook(Book book){
        Book a = books.stream().filter(book1-> book1.getId()==book.getId()).findFirst().get();
        a.setTitle(book.getTitle());
        a.setAuthorList(book.getAuthorList());
    }

    public void deleteBook(int id){
        Book b = books.stream().filter(book -> book.getId() == id).findFirst().get();
        books.remove(b);
    }

    public List<Book> getBooksByAuthor(String authorLastName){

        List<Book> bookList = new LinkedList<>();

        for (Book book : books) {
            if(book.getAuthorList().stream().anyMatch(a -> a.getLastName().equals(authorLastName))){
                bookList.add(book);
            }
        }
        return bookList;
    }
}
