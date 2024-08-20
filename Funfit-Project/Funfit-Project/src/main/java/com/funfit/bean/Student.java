package com.funfit.bean;

public class Student {
	private int sid;
	private String sname;
	private int age;
	private String phone;
	private String email;
	private int bid;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Student(int sid, String sname, int age, String phone, String email, int bid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.bid = bid;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", phone=" + phone + ", email=" + email
				+ ", bid=" + bid + "]";
	}

}
