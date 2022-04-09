package goorm1;
import java.util.*;
public class shortconditionaloperator {
	public static void main(String[] args) throws Exception {
		 Scanner input = new Scanner(System.in);
		
		 System.out.print("Input your age: ");
		 int age = input.nextInt();
		String category;
		if (age >= 20){
			category = "You can drive";
		} else {
			category = "You cannot drive";
		}
		
		 System.out.println("Your age is " + age + " and " + category);
	}
}