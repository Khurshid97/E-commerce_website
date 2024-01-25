package onlineBookShop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestUser {
	
	protected static List<Item> items = new ArrayList<>();
	
	public List<Item> getAllItems(){
		return items; 
	}

	// how do we get item type?
	public void getItemsByType() {
		for (Item item: items) {
			System.out.println(item);
		}
	}

	public void register(int id, String userName, String firstName, String lastName, Date LocalDate, Address address) {
		User newUser = new User(id, userName);
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setResgistrationDate(LocalDate);
		newUser.setAddress(address);
	}

}
