import java.util.Scanner;

public class Terminal {
	public int read(){
		Scanner in = new Scanner(System.in);
		System.out.println("?");
		int input = in.nextInt();
		return input;
		}
	
	public void print(String message){
		System.out.println("Output "+ message);
	}
}
