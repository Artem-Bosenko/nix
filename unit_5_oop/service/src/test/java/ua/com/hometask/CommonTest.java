package ua.com.hometask;

import org.apache.commons.collections.CollectionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import ua.com.hometask.impl.AuthorServiceImpl;
import ua.com.hometask.impl.BookServiceImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CommonTest {

    private static final AuthorServiceImpl authorService = new AuthorServiceImpl();
    private static final BookServiceImpl bookService = new BookServiceImpl();
    private static final List<Author> authorList = new LinkedList<>();
    private static final List<Book> bookList = new LinkedList<>();

    @BeforeAll
    public static void init() {
        int num = 5;
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            String firstName = "Oskar" + i;
            String lastName = "Test" + i;

            Author author = new Author();
            author.setFirstName(firstName);
            author.setLastName(lastName);
            authorList.add(author);
            for(int j = 0; j< 2; j++){
                Book b = new Book();
                String title = "testBook" + random.nextInt(200);
                b.setTitle(title);
                b.setAuthorList(authorList);
                bookList.add(b);
                bookService.create(b);
            }
            author.setBookList(bookList);
            authorService.create(author);

            bookList.removeAll(bookList);
            authorList.removeAll(authorList);
        }
        Assertions.assertTrue(CollectionUtils.isNotEmpty(authorService.findAll()));
    }

    @Test
    @Order(1)
    public void createAuthorTest(){
        Author author = new Author();
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
        Book book = new Book();
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
        Author a = authorService.findAuthorByFirstNameAndLastName("Oskar2","Test2");
        authorService.read(a);
    }

    @Test
    @Order(4)
    public void readBookTest(){
        Book b = bookService.findBookByTitle("testBook2");
        bookService.read(b);

    }

    @Test
    @Order(5)
    public void updateAuthorTest(){

        Author a = authorService.findAuthorByFirstNameAndLastName("Oskar2","Test2");
        a.setFirstName("Iv");
        a.setLastName("Mrafasga");
        authorService.update(a);
        Assertions.assertNotNull(authorService.findAuthorByFirstNameAndLastName("Iv", "Mrafasga"));
    }

    @Test
    @Order(6)
    public void updateBookTest(){
        Book b = bookService.findBookByTitle("testBook2");
        b.setTitle("Kuuu");
        bookService.update(b);
        Assertions.assertNotNull(bookService.findBookByTitle("Kuuu"));
    }

    @Test
    @Order(7)
    public void deleteAuthorTest(){

        Author a = authorService.findAuthorByFirstNameAndLastName("Oskar2","Test2");
        authorService.delete(a.getId());
        Assertions.assertFalse(authorService.isAuthorExist(a));
    }

    @Test
    @Order(8)
    public void deleteBookTest(){
        Book b = bookService.findBookByTitle("testBook2");
        bookService.delete(b.getId());
        Assertions.assertFalse(bookService.isBookExistByTitle(b));
    }
}
