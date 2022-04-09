package goorm1;
import java.util.*;
public class coronatest {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your body temperature?");
		double body = input.nextDouble();		
		if (body >= 37.5){
			System.out.println("You CANNOT enter the room");
		} else {
			System.out.println("You can enter the room");
		}
	}
}