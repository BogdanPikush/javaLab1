import org.example.Book;
import org.example.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    Library library;

    @BeforeEach
    public void addBookExample() {
        library = new Library();
        Book book1 = new Book("Java", "Evans", "978-1492025795", 2018);
        Book book2 = new Book("JavaScript", "Haverbeke", "978-5-4461-1226-5", 2019);
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void testGetAllBook() {
        library.getAllBook();
    }
    @Test
    public void testAddBook() {
        Book book3 = new Book("Python", "Mattes", "9781718502703", 2023);
        library.addBook(book3);
    }

    @Test
    public void testFindBookByName() {
        library.findBookByName("Java");
    }

    @Test
    public void testFindBookByNameNotFound() {
        library.findBookByName("PHP");
    }

    @Test
    public void testDeleteBookByIsbn() {
        library.deleteBookByIsbn("978-5-4461-1226-5");
        library.findBookByName("JavaScript");
    }

    @Test
    public void testDeleteBookByIsbnNotFound() {
        library.deleteBookByIsbn("978-5-4461-1226-5");
        library.findBookByName("JavaScript");
    }

}
