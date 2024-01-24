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

		// Fazendo a sobreposiçao:
		@Override
		public void withdraw(double amount) {
			//IMPORTANCIA DA PALAVRA SUPER NO METODO SOBRESCRITO:
			super.withdraw(amount); //efetuando o saque normal das regras da superclasse
			balance -= 2; //descotando um saldo somente do BusinessAccount;
		}
		
}
