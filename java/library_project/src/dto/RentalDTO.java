package dto;

public class RentalDTO {
	private int rentalId;
	private String customerId;
	private String bookId;
	private String rentalDate;
	
	
	public RentalDTO(int rentalId, String customerId, String bookId, String rentalDate) {
		this.rentalId = rentalId;
		this.customerId = customerId;
		this.bookId = bookId;
		this.rentalDate = rentalDate;
	}


	public int getRentalId() {
		return rentalId;
	}


	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getBookId() {
		return bookId;
	}


	public void setBookId(String bookId) {
		this.bookId = bookId;
	}


	public String getRentalDate() {
		return rentalDate;
	}


	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}
	
	
}