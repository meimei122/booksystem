package booksystem.dao;

import booksystem.entity.Students;

public interface StudentDao {
	/**
	 * 登录页面dao层
	 * @param students
	 * @return
	 */
	public Students login(Students students);
	
	/**
	 * 注册页面dao层
	 * @param students
	 * @return
	 */
	public int register(Students students);
}
