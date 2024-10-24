package com.cher.room.entities;

import java.util.List;

public class Expense {

	//private int id;
	private String name;
	private double currBal;
	private List expense;
	
	
	
	public Expense(String name, double currDue, List expense) {
		this.name = name;
		this.currBal = currDue;
		this.expense = expense;
	}
	
//public Member() {
//		
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCurrDue() {
		return currBal;
	}
	public void setCurrDue(double currDue) {
		this.currBal = currDue;
	}
	public List getExpense() {
		return expense;
	}
	public void setExpense(List expense) {
		this.expense = expense;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", currDue=" + currBal + ", expense=" + expense + "]";
	}
	
	
	
}
