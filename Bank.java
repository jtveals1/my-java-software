package lab;

import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		System.out.println("Welcome to DT Bank! Let's open your new account. How much would you like to deposit?");
		Scanner keyboard = new Scanner(System.in);
		double amount = keyboard.nextDouble();
		
		try {
			BankAccount account = new BankAccount(amount);
			System.out.println("Amount " + account.getAmount());
		}
		catch(NegativeBalanceException e) {
			System.out.println("We need money!" + e.getMessage());
			
		}
		finally{
			keyboard.close();
		}

	}

}
