
public class Memory {
private int[]mem;
	
	public Memory(int size){
	mem = new int[size];
			
	}
	
	public void loadMemory(){
		mem[0] = 799;
		mem[1] = 798;
		mem[2] = 198;
		mem[3] = 499;
		mem[4] = 1008;
		mem[5] = 1108;
		mem[6] = 899;
		mem[7] = 909;
		mem[8] = 898;
		mem[9] = 0000;
		}
	public int readFrom(int address){
		return mem[address];
	}
	public void writeTo(int address, int value){
		mem[address] = value;
	}

	public int size() {
		
		return mem.length;
	}


}
