package ua.com.nix.hometask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import ua.com.nix.hometask.impl.AuthorServiceImpl;
import ua.com.nix.hometask.impl.BookServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CRUDTest {

    private static final AuthorServiceImpl authorService = new AuthorServiceImpl();
    private static final BookServiceImpl bookService = new BookServiceImpl();
    private static final List<Author> authorList = new LinkedList<>();
    private static final List<Book> bookList = new LinkedList<>();
    private static final Book  book = new Book() ;
    private static final Author author = new Author();

    @Test
    @Order(1)
    public void createAuthorTest(){

        author.setFirstName("Petro");
        author.setLastName("Ivanko");
        authorList.add(author);
        for (int i = 0; i< 2; i++){
            Book b = new Book();
            b.setTitle("test" + i);
            b.setIdAuthorsList(Collections.singletonList(author.getId()));
            bookList.add(b);
        }
        List<Integer> idBooks = new ArrayList<>();
        for (Book book : bookList) {
            idBooks.add(book.getId());
        }
        author.setIdBooks(idBooks);

        authorService.create(author);

        Assertions.assertTrue(authorService.isAuthorExist(author));
    }

    @Test
    @Order(2)
    public void createBookrTest(){

        book.setTitle("Eneida");
        bookList.add(book);
        for (int i = 0; i< 2; i++){
            Author a = new Author();
            a.setLastName("testL" + i);
            a.setFirstName("testF"+i);
            a.setIdBooks(Collections.singletonList(book.getId()));
            authorList.add(a);
        }
        List<Integer> idAuthors = new ArrayList<>();
        for (Author a : authorList) {
            idAuthors.add(a.getId());
        }
        book.setIdAuthorsList(idAuthors);
        bookService.create(book);

        Assertions.assertTrue(bookService.isBookByTitleExist(book.getTitle()));
    }

    @Test
    @Order(3)
    public void readAuthorTest(){
        authorService.read(author.getId());
    }

    @Test
    @Order(4)
    public void readBookTest(){
        bookService.read(book.getId());

    }

    @Test
    @Order(5)
    public void updateAuthorTest(){


        author.setFirstName("Iv");
        author.setLastName("Mrafasga");
        authorService.update(author);
        Assertions.assertNotNull(authorService.findAuthorByFirstNameAndLastName("Iv", "Mrafasga"));
    }

    @Test
    @Order(6)
    public void updateBookTest(){
        book.setTitle("Kuuu");
        bookService.update(book);
        Assertions.assertNotNull(bookService.findBookByTitle("Kuuu"));
    }

    @Test
    @Order(7)
    public void deleteAuthorTest(){

        authorService.delete(author.getId());
        Assertions.assertFalse(authorService.isAuthorExist(author));
    }

    @Test
    @Order(8)
    public void deleteBookTest(){

        bookService.delete(book.getId());
        Assertions.assertFalse(bookService.isBookByTitleExist(book.getTitle()));
    }
}
