package booksystem.entity;

import java.util.Date;

public class BorrowBook {
	private Integer bid;
	private Date borrow_time;
	private Date return_time;
	private Integer borrow_num;
	private Book book;
	private Students students;
	
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
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Students getStudents() {
		return students;
	}
	public void setStudents(Students students) {
		this.students = students;
	}
}
