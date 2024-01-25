package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.AudioBook;

public class AudioBookTest {

	private AudioBook audioBook;

    @Before
    public void setUp() throws Exception {
        audioBook = new AudioBook(120); // Assuming 120 minutes audio length
        audioBook.setId(2);
        audioBook.setName("The Fantastic AudioBook");
        audioBook.setQuantity(5);
    }

    @Test
    public void testGetAudioLength() {
        assertEquals(120, audioBook.getAudioLength());
    }

    @Test
    public void testSetAudioLength() {
        audioBook.setAudioLength(150);
        assertEquals(150, audioBook.getAudioLength());
    }

    @Test
    public void testInheritedAttributes() {
        assertEquals(2, audioBook.getId());
        assertEquals("The Fantastic AudioBook", audioBook.getName());
        assertEquals(5, audioBook.getQuantity());
    }


}
