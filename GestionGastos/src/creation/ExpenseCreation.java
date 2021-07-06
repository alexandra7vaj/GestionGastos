package creation;

import java.util.Scanner;

import model.Expense;



public class ExpenseCreation {

	public static void ExpenseCreation (Expense newExpense) {
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Name:");
		newExpense.setName(reader.nextLine());

		System.out.println("Price:");
		newExpense.setPrice(reader.nextDouble());

		System.out.println("Date:"); 
		newExpense.setDate(reader.nextLine());	
		
		System.out.println(newExpense.toString());
       
		

	}

}
