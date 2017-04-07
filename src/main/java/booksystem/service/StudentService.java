package booksystem.service;

import booksystem.entity.Students;

public interface StudentService {
	
	/**
	 * 判断用户名密码是否匹配
	 * @param students
	 * @return
	 */
	public Students login(Students students);
	
	/**
	 * 判断用户名是否存在
	 * @param students
	 * @return
	 */
	public Students userName(Students students);
	
}