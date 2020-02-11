public class Test {
	public static void main(String[] args) {
		Memory mem = new Memory(100);
		mem.loadMemory();
		
		System.out.println(mem.readFrom(4) == 1008);
		
		mem.writeTo(3,499);
		System.out.println(mem.readFrom(3));
		
		Terminal t1 = new Terminal();
		t1.read();
		t1.print("Adam");
		
		
	}
}
