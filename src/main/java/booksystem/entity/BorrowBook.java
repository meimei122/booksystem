package booksystem.entity;

import java.util.Date;

public class BorrowBook {
	private Integer bid;
	private Date borrow_time;
	private Date return_time;
	private Integer borrow_num;
	private Integer sid;
	private String book_type;
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Date getBorrow_time() {
		return borrow_time;
	}
	public void setBorrow_time(Date borrow_time) {
		this.borrow_time = borrow_time;
	}
	public Date getReturn_time() {
		return return_time;
	}
	public void setReturn_time(Date return_time) {
		this.return_time = return_time;
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

}
