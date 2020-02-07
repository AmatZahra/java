
public class Packages extends Product implements Taxable{

	public Packages ( ) {
		
	}
	
	int quantity;
	int bc;

	public Packages(String string, double cost, int quantity, int bc) {
	
}

	public double price() {
		
		double price = cost*quantity;
		return price;
	}

	public double getTaxRate() {
		
		return 0;
	}

}