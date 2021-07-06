package controller;

//
//import java.util.Scanner;
//import menu.MenuExpense;
//import object.Expense;
//import object.Expenses;
//
//
//public class ControllerMenuExpense {
//
//		
//	public static void StartExpense() {
//			
//		Scanner reader = new Scanner(System.in);
//			
//		Expense toCreate = new Expense();
//			
//			while(true) {
//			
//				MenuExpense.menuExpensesToPrint();
//				
//				
//				int keyboard = reader.nextInt();
//				
//				switch (keyboard) {//
//				
//				case 1: 
//					Expenses.addExpense(toCreate);
//					break;
//				
//				case 2:
//					boolean ExpenseValidate = Login.validateExpense( toCreate.getExpenseName(), toCreate.getPassword());
//					System.out.println(toCreate.getName() + " validate: " + userValidate);
//					break;
//					
//				default:
//				    System.out.println(" please select a management ");
//					
//				}
//				
//			}
//		}
//}
//
