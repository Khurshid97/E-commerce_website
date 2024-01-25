package test;

import static org.junit.Assert.*;

import java.security.Provider.Service;

import org.junit.Before;
import org.junit.Test;

import onlineBookShop.Buyable;
import onlineBookShop.Exchangeable;
import onlineBookShop.Rentable;
import onlineBookShop.Subscribable;

public class ServiceTest {

	private Rentable rentableService;
	private Subscribable subscribable;
	private Buyable buyable;
	private Exchangeable exchangeable;

    @Before
    public void setUp() throws Exception {
    	String serviceName = "Test Rentable Service";
        double rentalPrice = 50.0;
        rentableService = new Rentable(serviceName, rentalPrice);
        
        String serviceName2 = "Test Subscribable Service";
        double rentalPrice2 = 100.0;
        subscribable = new Subscribable(serviceName2, rentalPrice2);
        
        String serviceName3 = "Test Buyable Service";
        double rentalPrice3 = 100.0;
        buyable = new Buyable(serviceName3, rentalPrice3);
        
        String serviceName4 = "Test Exchangeable Service";
        exchangeable = new Exchangeable(serviceName4);
    }

    @Test
    public void testGetServiceName() {
        assertEquals("Test Rentable Service", rentableService.getServiceName());
        assertEquals("Test Subscribable Service", subscribable.getServiceName());
        assertEquals("Test Buyable Service", buyable.getServiceName());
        assertEquals("Test Exchangeable Service", exchangeable.getServiceName());
    }

}
