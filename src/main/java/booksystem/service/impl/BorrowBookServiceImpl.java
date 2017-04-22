package booksystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import booksystem.dao.BorrowBookDao;
import booksystem.entity.BorrowBook;
import booksystem.service.BorrowBookService;

@Service("borrowBookService")
public class BorrowBookServiceImpl implements BorrowBookService {
	
	@Resource
	private BorrowBookDao borrowBookDao;
	
	@Override
	public List<BorrowBook> borrowInfo() {
		// TODO Auto-generated method stub
		return borrowBookDao.borrowInfo();
	}

	@Override
	public List<BorrowBook> borrowBook(BorrowBook borrowBook) {
		// TODO Auto-generated method stub
		return borrowBookDao.borrowBook(borrowBook);
	}

	@Override
	public int addBorrow(BorrowBook borrowBook) {
		// TODO Auto-generated method stub
		return borrowBookDao.addBorrow(borrowBook);
	}

}
