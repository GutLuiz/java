package entities;

public class Account {
		private Integer number;
		private String holder;
		protected Double balance;
		
		public Account() {
			
		}

		public Account(Integer number, String name, double balance) {
			this.number = number;
			this.holder = name;
			this.balance = balance;
		}

		public Integer getNumber() {
			return number;
		}


		public String getName() {
			return holder;
		}

		public void setName(String name) {
			this.holder = name;
		}

		public Double getBalance() {
			return balance;
		}

		public void Deposit(double amount) {
			balance += amount;
		}
		
		public void withdraw(double amount) {
			balance -= amount + 5;
		}
		
		
		
}
