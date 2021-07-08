package controller;

import java.util.Scanner;

import creation.ExpenseCreation;
import menu.MenuExpense;
import model.Expense;
import model.Expenses;
import model.User;

public class ControllerMenuExpense {

	
	public static void startExpense(User userValidate) {
			
		Scanner reader = new Scanner(System.in);
			
			while(true) {
			
				MenuExpense.menuExpensesToPrint();
				
				int keyboard = reader.nextInt();
				
				switch (keyboard) {
				
				case 1:
					
					//User userToCreate = new User();
				
					//userToCreate = UserCreation.createUser(userToCreate);
					
					Expense toCreateExpense = new Expense();
					toCreateExpense  = ExpenseCreation.expenseCreation(toCreateExpense);
					
					System.out.println(userValidate);
					System.out.println(toCreateExpense);
					System.out.println(userValidate.expenses);
					
					userValidate.expenses.put(toCreateExpense.getName(), toCreateExpense);
					
					
					
					
					break;
				
				case 2:
					//boolean ExpenseValidate = Login.validateExpense( toCreate.getExpenseName(), toCreate.getPassword());
					//System.out.println(toCreate.getName() + " validate: " + userValidate);
					break;
					
				default:
				    System.out.println(" please select a management ");
					
				}
				
			}
		}
	}
