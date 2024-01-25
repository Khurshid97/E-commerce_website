package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.EBook;

public class EbookTest {

	private EBook eBook;

    @Before
    public void setUp() throws Exception {
        eBook = new EBook(200); // Assuming 200 pages for the eBook
        eBook.setId(3);
        eBook.setName("The Amazing EBook");
        eBook.setQuantity(8);
    }
    
    @Test
    public void testGetPageCount() {
        assertEquals(200, eBook.getPageCount());
    }

    @Test
    public void testSetPageCount() {
        eBook.setPageCount(250);
        assertEquals(250, eBook.getPageCount());
    }

    @Test
    public void testInheritedAttributes() {
        assertEquals(3, eBook.getId());
        assertEquals("The Amazing EBook", eBook.getName());
        assertEquals(8, eBook.getQuantity());
    }

}
