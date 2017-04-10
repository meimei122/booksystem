package booksystem.dao;

import java.util.List;

import booksystem.entity.Students;

public interface StudentDao {
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
	
	/**
	 * 注册页面dao层
	 * @param students
	 * @return
	 */
	public int register(Students students);
}
