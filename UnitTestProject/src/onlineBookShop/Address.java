package onlineBookShop;

public class Address {
	
	private int id;
	private String street;
	private int number;
	private int zipCode;
	private String city;
	
	public Address(int id, String street, int number, int zipCode, String city) {

		this.id = id;
		this.street = street;
		this.number = number;
		this.zipCode = zipCode;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
