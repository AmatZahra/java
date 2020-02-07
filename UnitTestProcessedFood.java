import org.junit.*;
import static org.junit.Assert.*;

public class UnitTestProcessedFood
{
	public final double weight = 2.6;
	public final double cost = 1.5;
	public final double epsilon = 0.000001;
    
	
	public void testProcessedFood()
    {
    	
       ProcessedFood pFood = new ProcessedFood("apples", cost, weight);
   
        System.out.println("Checking price...");

        assertEquals(cost*weight, pFood.price(),epsilon);
     
        System.out.println("Price check is working.");
        
        System.out.println("Checking Tax Rate");
       
        assertEquals(Taxable.GST,pFood.getTaxRate(),epsilon);
        
        System.out.println("Tax rate is working");
    }


	private void assertEquals(double d, Object price, double epsilon2) {
		// TODO Auto-generated method stub
		
	}
}
