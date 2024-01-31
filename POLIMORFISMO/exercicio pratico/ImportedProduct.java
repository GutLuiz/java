package entities;

public class ImportedProduct extends Product{
		private double customFee;

		public ImportedProduct(String name, Double price, double customFee) {
			super(name, price);
			this.customFee = customFee;
		}

		public double getCustomFee() {
			return customFee;
		}

		public void setCustomFee(double customFee) {
			this.customFee = customFee;
		}
		
		public double totalPrice(){
			return customFee  + super.getPrice();
		}
		@Override
		public String priceTag(){
			return super.getName() + " $ " + String.format("%.2f", totalPrice()) + "(Customs fee: $ " + customFee + ")";
		}
}
