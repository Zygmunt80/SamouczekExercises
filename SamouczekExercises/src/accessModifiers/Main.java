package accessModifiers;

public class Main implements BankTransfer {
	
	public final int TRANSFER_FEE = 1;
	
	@Override
	public void transfer(BankAccount from, BankAccount to, int amount) {
		// TODO Auto-generated method stub
		from.withdraw(amount+TRANSFER_FEE);
		to.deposit(amount+TRANSFER_FEE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		account1.deposit(1000);
		account2.deposit(2000);
		account1.showBalance();
		account2.showBalance();
		
		Main main = new Main();
		main.transfer(account1, account2, 300);
		
		account1.showBalance();
		account2.showBalance();		
	}

}
