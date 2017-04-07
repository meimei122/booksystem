package booksystem.service;

import booksystem.entity.Students;

public interface StudentService {
	
	/**
	 * 登录页面service层
	 * @param students
	 * @return
	 */
	public Students login(Students students);
	
}