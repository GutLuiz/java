package entities;

public final class SavingsAccount  extends Account{
	private double interestRate;
	
	
	public SavingsAccount() {
		super();
	}


	public SavingsAccount(Integer number, String name, double balance, double interestRate) {
		super(number, name, balance);
		this.interestRate = interestRate;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// Fazendo a sobreposiçao:
	@Override
	public  final void withdraw(double amount) {
		balance -= amount;
	}
	
}
