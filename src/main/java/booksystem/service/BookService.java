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
}
