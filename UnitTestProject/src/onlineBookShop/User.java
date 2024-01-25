package onlineBookShop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User extends GuestUser {	
	private int id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private Date birthDay;
	private Date resgistrationDate;
	
	private ArrayList<Address> address = new ArrayList<>();
	public ArrayList<Ticket> tickets = new ArrayList<>();

	public User(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public List<Address> getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address.add(address);
	}
	
	public Date getResgistrationDate() {
		return resgistrationDate;
	}
	
	public void setResgistrationDate(Date resgistrationDate) {
		this.resgistrationDate = resgistrationDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birthDay=" + birthDay + ", address=" + address + ", resgistrationDate="
				+ resgistrationDate + "]";
	}
	
	
	public boolean login(String username, String passWord) {
		if(username == this.userName && this.password == passWord) {
			return true;
		}else {
			return false;
		}
	}

	public String selectItem(int Id) {
		for(Item elem:super.getAllItems()) {
			if(elem.getId() == Id) {
				return elem.getName();
			}
		}
		return null;
	}
	
	
	public boolean pay(Integer amount) {
		if(amount > 0) {
			return true;
		}
		return false;
	}
	
	public boolean createTicket(Ticket ticket) {
		if(ticket.getPrimaryMessage()!="") {
			return true;
		}
		return false;
	}
	
	public Ticket editTicket(Ticket ticket, String message) {
		if(ticket.getPrimaryMessage()!="") {
			ticket.setPrimaryMessage(message);
			return ticket;
		}
		return ticket;
	}
	
	public Ticket getTicket(int id, Ticket ticket) {
		if(tickets.contains(ticket)) {
			return ticket;
		}
		return null;
	}

}
