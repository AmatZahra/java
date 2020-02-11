import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class UnitTestTerminal
{
    
	public void testInput()
    {
        Terminal term = new Terminal();
        Scanner scan = new Scanner(System.in);
        int input;
        
        System.out.println("Testing input...");
        System.out.print("Enter an integer value: ");
        input = scan.nextInt();
        
        System.out.println("Enter the same integer value again:");
        assertEquals(input, term.read());
        
        System.out.println("Terminal input is working.");
    }
}
