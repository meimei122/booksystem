package booksystem.service;

import java.util.List;

import booksystem.entity.BorrowBook;

public interface BorrowBookService {
	
	public List<BorrowBook> borrowInfo();
	
	public List<BorrowBook> borrowBook(BorrowBook borrowBook);
}
