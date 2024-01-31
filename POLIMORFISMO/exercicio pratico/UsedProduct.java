package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manuFactureDate;
		
		
	    public UsedProduct () {
		}
		public UsedProduct(String name, Double price, Date manuFactureDate) {
			super(name, price);
			this.manuFactureDate = manuFactureDate;
		}
		
		@Override
		public String priceTag() {
		    return super.getName() + " (used) $ " + String.format("%.2f", super.getPrice()) + " (Manufacture date: " + sdf.format(manuFactureDate) + ")";
		}

		
}
