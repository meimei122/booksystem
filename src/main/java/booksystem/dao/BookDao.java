package booksystem.dao;

import java.util.List;

import booksystem.entity.Book;

public interface BookDao {
	
	/**
	 * 首页图书信息统计
	 * @return
	 */
	public List<Book> bookInfo();
	
	/**
	 * 图书信息统计给用户借书使用
	 * @return
	 */
	public List<Book> book(Book book);
	
	/**
	 * 借书之后图书数量修改
	 * @param book
	 * @return
	 */
	public int borrow(Integer book_isbn);
}
