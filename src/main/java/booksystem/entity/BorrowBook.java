package booksystem.entity;

import com.mysql.fabric.xmlrpc.base.Data;

public class BorrowBook {
	private Integer bid;
	private Data borrow_time;
	private Data return_time;
	private Integer sid;
	private Integer book_isbn;
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Data getBorrow_time() {
		return borrow_time;
	}
	public void setBorrow_time(Data borrow_time) {
		this.borrow_time = borrow_time;
	}
	public Data getReturn_time() {
		return return_time;
	}
	public void setReturn_time(Data return_time) {
		this.return_time = return_time;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(Integer book_isbn) {
		this.book_isbn = book_isbn;
	}
}
