package onlineBookShop;

import java.util.ArrayList;
public class Item {
	
	private int id;
	private String name;
	private String ISBN;
	private String publishedYear;
	private ArrayList<String> tags = new ArrayList<>();
	private int quantity;
	private Object type;

	public Item() {};
	
	public Item(int id, int quantity, String name) {
		this.id = id;
		this.quantity = quantity;
		this.name = name;
	}
	
	public Object getType() {
		return this.type;
	}

	public void setType(Object type) {
		this.type = type;
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String getPublishedYear() {
		return publishedYear;
	}
	
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	public ArrayList<String> getTags() {
		return tags;
	}
	
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
	
	
	
	

}
