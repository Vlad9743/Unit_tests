package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    void testFindBookById()
    {
        BookRepository mockedBookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(mockedBookRepository);
        when(mockedBookRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        Book book = bookService.findBookById("1");

        assertThat(book.getTitle()).isEqualTo("Book1");
    }

    @Test
    void testFindAllBooks()
    {
        BookRepository mockedBookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(mockedBookRepository);
        List <Book> books1 = new ArrayList<>();
        books1.add(new Book("1", "Book1", "Author1"));
        books1.add(new Book("2", "Book2", "Author2"));
        when(mockedBookRepository.findAll()).thenReturn(books1);

        List <Book> testBooks = bookService.findAllBooks();

        assertThat(testBooks).hasSize(2);
        assertThat(testBooks.get(0).getTitle()).isEqualTo("Book1");
        assertThat(testBooks.get(1).getAuthor()).isEqualTo("Author2");
    }
}