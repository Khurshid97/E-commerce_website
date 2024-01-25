package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Item;
import onlineBookShop.Moderator;
import onlineBookShop.Ticket;
import onlineBookShop.User;

public class ModeratorTest {
	private Moderator moderator;
    private User regularUser;
    private ArrayList<Ticket> tickets;

    @Before
    public void setUp() {
        moderator = new Moderator(1, "JohnDoe", true);
        regularUser = new User(2, "JaneDoe");

        Ticket ticket1 = new Ticket(1, "Hello", null, null);
        Ticket ticket2 = new Ticket(2, "world 2", null, null);
        Ticket ticket3 = new Ticket(3, "Hello world 3", null, null);
        
        tickets = new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
    }

    @Test
    public void testIsModerator() {
        assertTrue(moderator.isModerator());
    }

    @Test
    public void testSetModerator() {
        moderator.setModerator(false);
        assertFalse(moderator.isModerator());
    }

    @Test
    public void testConstructorWithModeratorTrue() {
        Moderator newModerator = new Moderator(2, "Alice", true);
        assertTrue(newModerator.isModerator());
    }

    @Test
    public void testConstructorWithModeratorFalse() {
        Moderator newModerator = new Moderator(3, "Bob", false);
        assertFalse(newModerator.isModerator());
    }

    @Test
    public void testItemId() {
        assertEquals(1, moderator.getId());
    }

    @Test
    public void testUserName() {
        assertEquals("JohnDoe", moderator.getUserName());
    }
    
    @Test
    public void testDeleteUser() {
    	regularUser = (User) moderator.manageUser(2, regularUser, "delete");
        assertNull(regularUser);
    }

    @Test
    public void testAddModerator() {
    	regularUser = (User) moderator.manageUser(3, regularUser, "addModerator");
        assertTrue(regularUser instanceof Moderator);
        assertTrue(((Moderator) regularUser).isModerator());
    }
    
    

    @Test
    public void testAddNewItem() {
        Item newItem = new Item(1, 10,  "New Item");
        moderator.addNewItem(newItem);
        assertTrue(moderator.items.contains(newItem));
        assertEquals(1, moderator.items.size());
    }

    @Test
    public void testAddDuplicateItem() {
        // Adding an item
        Item newItem = new Item(1, 5, "New Item");
        moderator.addNewItem(newItem);

  
        moderator.addNewItem(newItem);

        assertEquals(1, moderator.items.size());
    }

    @Test
    public void testAddMultipleItems() {
        Item item1 = new Item(1,2, "Item 1");
        Item item2 = new Item(2,5, "Item 2");

        moderator.addNewItem(item1);
        moderator.addNewItem(item2);

        assertTrue(moderator.items.contains(item1));
        assertTrue(moderator.items.contains(item2));
        assertEquals(2, moderator.items.size());
    }
    
    @Test
    public void testGetTickets() {
    	ArrayList<Ticket> returnedTickets = moderator.getTickets(tickets);
    	assertSame(tickets, returnedTickets);

        // Optionally, you can also assert that the content is the same
        assertEquals(tickets, returnedTickets);
    }
    
    @Test
    public void testModifyTicket() {
        Ticket originalTicket = new Ticket(1, "Hello", null, null);
        Ticket modifiedTicket = moderator.modifyTickets(originalTicket, "Updated message");

        
        assertSame(originalTicket, modifiedTicket);
        assertEquals("Updated message", modifiedTicket.getPrimaryMessage());
    }
    
    
}
