package booksystem.service;

import java.util.List;

import booksystem.entity.Book;

public interface BookService {
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
	 * 修改借书之后的图书数量
	 * @param book
	 * @return
	 */
	public int borrow(Integer book_isbn);
}
