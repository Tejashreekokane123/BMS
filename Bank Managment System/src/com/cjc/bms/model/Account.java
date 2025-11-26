package com.cjc.bms.model;

public class Account {
	private long accNo;
	private String name;
	private long mobNo;
	private long adharNo;
	private String gender;
	private int age;
	private double balance;

	public void setAccNo(long accno2) {
		this.accNo = accno2;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;

	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public long getAdharNo() {
		return adharNo;

	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;

	}

	public void setBalance(double balance) {
		this.balance = balance;

	}

	public double getBalance() {
		return balance;
	}

}
