package goorm1;
import java.util.*;
public class canigetvaccine {
	public static void main(String[] args) throws Exception {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = console.nextInt();
		if (age >= 65){
			System.out.println("You will get vaccine soon");
		}
		else if (age >= 18){
			System.out.println("You will get vacinne after June");
		}
		 else {
			System.out.println("Please wait for further news");
		}
	}
}