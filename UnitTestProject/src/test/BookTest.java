package test;

import static org.junit.Assert.*;
import onlineBookShop.Book;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

	private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book(300);
        book.setId(1);
        book.setName("The Great Book");
        book.setQuantity(10);
    }

    @Test
    public void testGetPageCount() {
        assertEquals(300, book.getPageCount());
    }

    @Test
    public void testSetPageCount() {
        book.setPageCount(400);
        assertEquals(400, book.getPageCount());
    }

    @Test
    public void testInheritedAttributes() {
        assertEquals(1, book.getId());
        assertEquals("The Great Book", book.getName());
        assertEquals(10, book.getQuantity());
    }

}
