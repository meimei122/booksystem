package booksystem.entity;

public class BorrowBook {
	private Integer bid;
	private String borrow_time;
	private String return_time;
	private Integer borrow_num;
	private Integer sid;
	private String book_type;
	private Integer book_isbn;
	private String book_name;
	private String outDate;
	private String pay;
	private String outDateNum;
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getBorrow_num() {
		return borrow_num;
	}
	public void setBorrow_num(Integer borrow_num) {
		this.borrow_num = borrow_num;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	public String getBorrow_time() {
		return borrow_time;
	}
	public void setBorrow_time(String borrow_time) {
		this.borrow_time = borrow_time;
	}
	public String getReturn_time() {
		return return_time;
	}
	public void setReturn_time(String return_time) {
		this.return_time = return_time;
	}
	public Integer getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(Integer book_isbn) {
		this.book_isbn = book_isbn;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getOutDate() {
		return outDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}
	public String getOutDateNum() {
		return outDateNum;
	}
	public void setOutDateNum(String outDateNum) {
		this.outDateNum = outDateNum;
	}
}
