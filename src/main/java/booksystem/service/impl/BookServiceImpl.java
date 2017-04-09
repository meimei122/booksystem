package booksystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import booksystem.dao.BookDao;
import booksystem.entity.Book;
import booksystem.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Resource()
	private BookDao bookDao;
	
	@Override
	public List<Book> bookInfo() {
		// TODO Auto-generated method stub
		return bookDao.bookInfo();
	}

}
