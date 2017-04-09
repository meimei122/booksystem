package booksystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import booksystem.entity.Book;
import booksystem.entity.UtilEntity;
import booksystem.service.BookService;

@Controller
@RequestMapping("BookController")
public class BookController {
	
	@Resource
	private BookService bookService;
	
	@ResponseBody
	@RequestMapping(value = "bookInfo",method = RequestMethod.POST)
	public List<UtilEntity> bookInfo() {
		List<UtilEntity> utilList = new ArrayList<UtilEntity>();
		List<Book> bookList = bookService.bookInfo();
		UtilEntity list0 = new UtilEntity();
		UtilEntity list1 = new UtilEntity();
		UtilEntity list2 = new UtilEntity();
		UtilEntity list3 = new UtilEntity();
		UtilEntity list4 = new UtilEntity();
		list0.setName(bookList.get(0).getBook_name());
		list0.setValue(bookList.get(0).getBook_totalnum());
		utilList.add(list0);
		list1.setName(bookList.get(1).getBook_name());
		list1.setValue(bookList.get(1).getBook_totalnum());
		utilList.add(list1);
		list2.setName(bookList.get(2).getBook_name());
		list2.setValue(bookList.get(2).getBook_totalnum());
		utilList.add(list2);
		list3.setName(bookList.get(3).getBook_name());
		list3.setValue(bookList.get(3).getBook_totalnum());
		utilList.add(list3);
		list4.setName(bookList.get(4).getBook_name());
		list4.setValue(bookList.get(4).getBook_totalnum());
		utilList.add(list4);
		return utilList;
	}
}
