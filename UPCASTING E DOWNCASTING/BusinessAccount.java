package entities;

public class BusinessAccount extends Account{
		private double loanLimit;
		
		public BusinessAccount() {
			super();
		}

		public BusinessAccount(Integer number, String name, double balance, double loanLimit) {
			super(number, name, balance);
			this.loanLimit = loanLimit;
		}

		public double getLoanLimit() {
			return loanLimit;
		}

		public void setLoanLimit(double loanLimit) {
			this.loanLimit = loanLimit;
		}
		
		public void loan (double amount) {
			if(amount <= loanLimit) {
				Deposit(amount);
			}
		}
}
