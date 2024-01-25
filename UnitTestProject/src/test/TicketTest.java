package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import onlineBookShop.Address;
import onlineBookShop.Ticket;
import onlineBookShop.User;

public class TicketTest {
	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void testGettersAndSetters() {
		Date initiateDate = new Date();
        Date resolveDate = new Date();
        ArrayList<String> comments = new ArrayList<>();

        Ticket ticket = new Ticket(1, "Issue", initiateDate, resolveDate);
        
        assertEquals(1, ticket.getId());
        assertEquals("Issue", ticket.getPrimaryMessage());
        assertEquals(initiateDate, ticket.getInitiateDate());
        assertEquals(resolveDate, ticket.getResolveDate());
        assertNull(ticket.getCommnets());

        ticket.setId(2);
        ticket.setPrimaryMessage("Updated Issue");
        Date newInitiateDate = new Date();
        Date newResolveDate = new Date();
        ticket.setInitiateDate(newInitiateDate);
        ticket.setResolveDate(newResolveDate);
        ticket.setCommnets(comments);

        assertEquals(2, ticket.getId());
        assertEquals("Updated Issue", ticket.getPrimaryMessage());
        assertEquals(newInitiateDate, ticket.getInitiateDate());
        assertEquals(newResolveDate, ticket.getResolveDate());
	}
	
	@Test
    public void testConstructor() {
        Date initiateDate = new Date();
        Date resolveDate = new Date();

        Ticket ticket = new Ticket(1, "Issue", initiateDate, resolveDate);

        assertEquals(1, ticket.getId());
        assertEquals("Issue", ticket.getPrimaryMessage());
        assertEquals(initiateDate, ticket.getInitiateDate());
        assertEquals(resolveDate, ticket.getResolveDate());
        assertNull(ticket.getCommnets());
    }

}
