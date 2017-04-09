package booksystem.dao;

import java.util.List;

import booksystem.entity.BorrowBook;

public interface BorrowBookDao {
	
	public List<BorrowBook> borrowInfo();
}
