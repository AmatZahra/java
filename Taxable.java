public interface Taxable {
	
	//declaration of constants
	final public int BC = 0; // province of British Columbia
	final public int ALB = 1; // province of Alberta
	final public double BC_PST = 7.5; // PST percentage in BC
	final public double ALB_PST = 0; // PST percentage in ALB
	final public double GST = 5; // GST percentage
	
	//declaration of abstract methods
	public double getTaxRate(); // returns the tax rate.
}