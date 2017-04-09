package booksystem.dao;

import java.util.List;

import booksystem.entity.Book;

public interface BookDao {
	
	/**
	 * 查询书记信息
	 * @return
	 */
	public List<Book> bookInfo();
	
}
