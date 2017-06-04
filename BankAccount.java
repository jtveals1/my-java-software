package lab;

public class BankAccount {

	private double amount;

		public BankAccount(double startingAmount) throws NegativeBalanceException {
			if (startingAmount < 0){
				throw new NegativeBalanceException("You must open the account with a balance of more than 0");
			}			
			amount = startingAmount;
		}
		
	public double getAmount() {
		return amount;
	}
}
