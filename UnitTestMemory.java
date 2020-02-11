import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class UnitTestMemory
{
    
    public void testInitSize()
    {
        // Test correct instantiation
        Memory memBank = new Memory(20);
        assertEquals(20, memBank.size());
        
        memBank = new Memory(100);
        assertEquals(100, memBank.size());
    }
    
    
    public void testSizeBoundaries()
    {
       // Test lower boundary
      Memory memBank = new Memory(0);
      assertEquals(0, memBank.size());
      
      // Upper boundary is bounded by Integer.MAX_VALUE and
      // will most likely exceed the maximum memory of the VM.
    }
    
    
    public void testRead()
    {
        // Create a new Memory object of a random size.
        Random rnd = new Random();
        int size = rnd.nextInt(10000);
        int[] values = new int[size];
        Memory memBank = new Memory(size);
        
        // Write random values to every memory location
        for (int i=0; i<values.length; i++)
        {
            values[i] = rnd.nextInt();
            memBank.writeTo(i, values[i]);
        }
        
        
        // Read back the values from memory and ensure they are the
        // same values we originally stored.
        for (int i=0; i<values.length; i++)
        {
            assertEquals(values[i], memBank.readFrom(i));
        }
        
    }
        
        
    // Ensure the default program is successfully loaded into
    // memory.
   
    public void testDefaultProgram()
    {
    	Memory membank = new Memory(100);
    	membank.loadMemory();
    	
    	assertEquals(799, membank.readFrom(0));
    	assertEquals(898, membank.readFrom(8));
    }
}