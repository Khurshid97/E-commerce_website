package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.AudioBook;
import onlineBookShop.Book;
import onlineBookShop.EBook;
import onlineBookShop.Item;


public class ItemTest {
	private Item item;
	private Book book;
	private AudioBook audiobook;
	private EBook ebook;

    @Before
    public void setUp() throws Exception {
        item = new Item(1, 10, "Book");
    }
    
    @Test
    public void testType() {
    	item.setType(book);
        assertEquals(book, item.getType());
        
        item.setType(audiobook);
        assertEquals(audiobook, item.getType());
        
        item.setType(ebook);
        assertEquals(ebook, item.getType());
    }

    @Test
    public void testGetQuantity() {
        assertEquals(10, item.getQuantity());
    }

    @Test
    public void testSetQuantity() {
        item.setQuantity(20);
        assertEquals(20, item.getQuantity());
    }

    @Test
    public void testGetId() {
        assertEquals(1, item.getId());
    }

    @Test
    public void testSetId() {
        item.setId(2);
        assertEquals(2, item.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Book", item.getName());
    }

    @Test
    public void testSetName() {
        item.setName("Ebook");
        assertEquals("Ebook", item.getName());
    }

    @Test
    public void testGetISBN() {
        assertNull(item.getISBN());
    }

    @Test
    public void testSetISBN() {
        item.setISBN("123456789");
        assertEquals("123456789", item.getISBN());
    }

    @Test
    public void testGetPublishedYear() {
        assertNull(item.getPublishedYear());
    }

    @Test
    public void testSetPublishedYear() {
        item.setPublishedYear("2022");
        assertEquals("2022", item.getPublishedYear());
    }

    @Test
    public void testGetTags() {
        assertNotNull(item.getTags());
        assertEquals(0, item.getTags().size());
    }

    @Test
    public void testSetTags() {
        ArrayList<String> tags = new ArrayList<>();
        tags.add("Fiction");
        tags.add("Thriller");
        item.setTags(tags);

        assertEquals(tags, item.getTags());
    }

    @Test
    public void testToString() {
        String expectedToString = "Item [id=1, name=Book, quantity=10]";
        assertEquals(expectedToString, item.toString());
    }
}
