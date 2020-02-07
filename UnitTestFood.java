import org.junit.*;
import static org.junit.Assert.*;

public class UnitTestFood
{
	public final double weight = 2.6;
	public final double cost = 1.5;
	public final double epsilon = 0.000001;
    
	@Test
	public void testFood()
    {
    	
       Food food = new Food("apples", cost, weight);
       
   
        System.out.println("checking price...");

        assertEquals(cost*weight, food.price(),epsilon);
     
        System.out.println("Price check is working.");
    }
}
