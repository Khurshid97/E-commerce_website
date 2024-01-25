package onlineBookShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Moderator extends User {
    public ArrayList<Item> items = new ArrayList<>();
    private boolean isModerator;
    
    public Moderator(int id, String userName, boolean isModerator) {
        super(id, userName);
        this.isModerator = isModerator;
    }

    public boolean isModerator() {
        return isModerator;
    }

    public void setModerator(boolean moderator) {
        isModerator = moderator;
    }

    // The order about what to do with the user, like delete,or make user a moderator
    public Object manageUser(int id, User user, String order){
        if (order == "delete") {
        	user = null;
        	return user;
        } else if(order == "addModerator") {
            Moderator userMod = new Moderator(id, user.getUserName(), true);
            return userMod;
        }
		return null;
    }

    // create new Item, and add it to the database
    public void addNewItem(Item item) {
        if (!items.contains(item)) {
        	items.add(item);
        } else {
            System.out.println("Item with ID " + item.getId() + " already exists. Please add a unique ID.");
            System.out.println("Current size of allNewItems: " + items.size());
        }
    }
    
    public ArrayList<Ticket> getTickets(ArrayList<Ticket> tickets){
    	return tickets;
    }
    public Ticket modifyTickets(Ticket ticket, String message){
    	ticket.setPrimaryMessage(message);
    	return ticket;
    }
}