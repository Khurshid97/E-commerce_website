package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Exchangeable;

public class ExchangeableTest {

	private Exchangeable exchangeable;

    @Before
    public void setUp() throws Exception {
        exchangeable = new Exchangeable("Book Exchange"); // Assuming an exchangeable service with a price of 15.99
    }

    @Test
    public void testIsAvailableForExchange() {
        assertFalse(exchangeable.isAvailableForExchange()); // By default, not available for exchange
    }

    @Test
    public void testSetAvailableForExchange() {
        exchangeable.setAvailableForExchange(true);
        assertTrue(exchangeable.isAvailableForExchange());
    }

    @Test
    public void testInheritedMethod() {
        assertEquals("Book Exchange", exchangeable.getServiceName());
    }

}
