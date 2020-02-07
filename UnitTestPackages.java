import org.junit.*;
import static org.junit.Assert.*;

public class UnitTestPackages
{
	public final int quantity= 13;
	public final double cost = 1.5;
	public final double epsilon = 0.000001;
   
	public void testPackages()
    {
    	
		Packages packages = new Packages("cookies", cost, quantity,Taxable.BC);
       
        System.out.println("Checking price for BC...");

        assertEquals(cost*quantity, packages.price(),epsilon);
     
        System.out.println("Price check is working.");
        
        System.out.println("Checking Tax Rate for BC");
       
        assertEquals(Taxable.GST+Taxable.BC_PST,packages.getTaxRate(),epsilon);
        
        System.out.println("Tax rate is working for BC");
        
        packages= new Packages("cookies", cost, quantity,Taxable.ALB);
        
        System.out.println("Checking price for Alberta...");

        assertEquals(cost*quantity, packages.price(),epsilon);
     
        System.out.println("Price check is working.");
        
        System.out.println("Checking Tax Rate for Alberta");
       
        assertEquals(Taxable.GST+Taxable.ALB_PST,packages.getTaxRate(),epsilon);
        
        System.out.println("Tax rate is working for ALB");
    }
}
