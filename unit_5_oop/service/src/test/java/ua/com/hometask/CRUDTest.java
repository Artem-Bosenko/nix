package ua.com.hometask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import ua.com.hometask.impl.AuthorServiceImpl;
import ua.com.hometask.impl.BookServiceImpl;

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
            b.setAuthorList(authorList);
            bookList.add(b);
        }
        author.setBookList(bookList);
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
            a.setBookList(bookList);
            authorList.add(a);
        }
        book.setAuthorList(authorList);
        bookService.create(book);

        Assertions.assertTrue(bookService.isBookExistByTitle(book));
    }

    @Test
    @Order(3)
    public void readAuthorTest(){
        authorService.read(author);
    }

    @Test
    @Order(4)
    public void readBookTest(){
        bookService.read(book);

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
        Assertions.assertFalse(bookService.isBookExistByTitle(book));
    }
}
