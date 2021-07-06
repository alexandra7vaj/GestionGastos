package model;

import java.util.HashMap; // import - tiene funcción de referirse a las clases

public class Expenses {
	
	public HashMap<String, Expense> expenses ;
	public Integer counter = 0;
	
	
	public Expenses() {
		
		this.expenses =  new HashMap<String, Expense>();
	}


	public void addExpense(String name, Double price, String date) {
		
		Expense newExpense = new Expense(name, price, date);
		counter++;
		this.getExpenses().put( counter.toString()  + "_"  + name, newExpense);
		
		
	}
	
	public HashMap<String, Expense> getExpenses() {
		return expenses;
	}


	public void setExpenses(HashMap<String, Expense> expenses) {
		this.expenses = expenses;
	}

}