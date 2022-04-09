package goorm1;
import java.io.*;
import java.util.*;
public class useswitch {
	public static void main(String[] args) throws Exception {
			char ans=' ';
    System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
    System.out.println("a. int 1x=10");
    System.out.println("b. int x=10");
    System.out.println("c. float x=10.0f");
    System.out.println("d. string x=\"10\"");
    System.out.print("Enter your choice:");
		
		Scanner input = new Scanner(System.in);
		ans = input.next().charAt(0);
		
		switch (ans)
		{
			case 'a' : System.out.println("Invalid choice!"); break;
			case 'b' : System.out.println("Congratulation!"); break;
			case 'c' : System.out.println("Invalid choice!"); break;
			case 'd' : System.out.println("Invalid choice!"); break;
			default: System.out.println("Bad choice!");break;
		}	
	}
}