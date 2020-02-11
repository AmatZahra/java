
public interface MemoryInterface {

	public void writeTo(int location, int value);
	
	public int readFrom(int location);
	
	public void loadMemory();
	
	public int size();
	
}
