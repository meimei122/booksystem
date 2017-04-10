package booksystem.service;

import java.util.List;

import booksystem.entity.BorrowBook;

public interface BorrowBookService {
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
}
