package booksystem.entity;

/**
 * 学生用户实体类
 * @author Administrator
 *
 */
public class Students {
	private Integer sid;
	private String username;
	private String pass;
	private String tel;
	private int borrow_num;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getBorrow_num() {
		return borrow_num;
	}
	public void setBorrow_num(int borrow_num) {
		this.borrow_num = borrow_num;
	}
}
