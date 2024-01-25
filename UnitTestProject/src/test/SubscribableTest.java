package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Subscribable;

public class SubscribableTest {

	 private Subscribable subscribable;

	    @Before
	    public void setUp() throws Exception {
	        subscribable = new Subscribable("Magazine Subscription", 25.99); // Assuming a subscribable service with a price of 25.99
	    }

	    @Test
	    public void testGetSubscriptionFee() {
	        assertEquals(25.99, subscribable.getSubscriptionFee(), 0.001); // Default value is 0.0
	    }

	    @Test
	    public void testSetSubscriptionFee() {
	        subscribable.setSubscriptionFee(30.0);
	        assertEquals(30.0, subscribable.getSubscriptionFee(), 0.001);
	    }

	    @Test
	    public void testGetSubscriptionPeriod() {
	        assertEquals(0.0, subscribable.getSubscriptionPeriod(), 0.001); // Default value is 0.0
	    }

	    @Test
	    public void testSetSubscriptionPeriod() {
	        subscribable.setSubscriptionPeriod(12.0);
	        assertEquals(12.0, subscribable.getSubscriptionPeriod(), 0.001);
	    }

	    @Test
	    public void testGetSubscriptionStartsFrom() {
	        assertNull(subscribable.getSubscriptionStartsFrom()); // Default value is null
	    }

	    @Test
	    public void testSetSubscriptionStartsFrom() {
	        Date startDate = new Date();
	        subscribable.setSubscriptionStartsFrom(startDate);
	        assertEquals(startDate, subscribable.getSubscriptionStartsFrom());
	    }

	    @Test
	    public void testGetSubscrptionEndsOn() {
	        assertNull(subscribable.getSubscrptionEndsOn()); // Default value is null
	    }

	    @Test
	    public void testSetSubscrptionEndsOn() {
	        Date endDate = new Date();
	        subscribable.setSubscrptionEndsOn(endDate);
	        assertEquals(endDate, subscribable.getSubscrptionEndsOn());
	    }


}
