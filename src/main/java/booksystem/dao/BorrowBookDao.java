package booksystem.dao;

import java.util.List;

import booksystem.entity.BorrowBook;

public interface BorrowBookDao {
	/**
	 * 首页借书信息统计
	 * @return
	 */
	public List<BorrowBook> borrowInfo();
	
	/**
	 * 当前用户借书信息
	 * @param borrowBook
	 * @return
	 */
	public List<BorrowBook> borrowBook(BorrowBook borrowBook);
	
	/**
	 * 添加借书信息
	 */
	//public List<BorrowBook> addBorrow(BorrowBook borrowBook);
	
}
