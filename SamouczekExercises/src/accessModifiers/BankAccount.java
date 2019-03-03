package accessModifiers;

public class BankAccount implements /* BankTransfer, */ Account {

	// private int accountNumber;
	private double accountBalance;

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		this.accountBalance += amount;
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		this.accountBalance -= amount;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void showBalance() {
		System.out.println(getAccountBalance());
	}

}
