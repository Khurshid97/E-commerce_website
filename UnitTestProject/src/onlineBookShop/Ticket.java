package onlineBookShop;

import java.util.ArrayList;
import java.util.Date;

public class Ticket {
	
	private int id;
	private String primaryMessage;
	private Date initiateDate;
	private Date resolveDate;
	
	private ArrayList<String> commnets = null;
	

	public Ticket(int id, String primaryMessage, Date initiateDate, Date resolveDate) {

		this.id = id;
		this.primaryMessage = primaryMessage;
		this.initiateDate = initiateDate;
		this.resolveDate = resolveDate;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimaryMessage() {
		return primaryMessage;
	}

	public void setPrimaryMessage(String primaryMessage) {
		this.primaryMessage = primaryMessage;
	}

	public Date getInitiateDate() {
		return initiateDate;
	}

	public void setInitiateDate(Date initiateDate) {
		this.initiateDate = initiateDate;
	}

	public Date getResolveDate() {
		return resolveDate;
	}

	public void setResolveDate(Date resolveDate) {
		this.resolveDate = resolveDate;
	}

	public ArrayList<String> getCommnets() {
		return commnets;
	}

	public void setCommnets(ArrayList<String> commnets) {
		this.commnets = commnets;
	};

	

}
