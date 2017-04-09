package booksystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import booksystem.dao.BorrowBookDao;
import booksystem.entity.BorrowBook;
import booksystem.service.BorrowBookService;

public class BorrowBookServiceImpl implements BorrowBookService {
	@Resource()
	private BorrowBookDao borrowBookDao;
	
	@Override
	public List<BorrowBook> borrowInfo() {
		// TODO Auto-generated method stub
		return borrowBookDao.borrowInfo();
	}

}
