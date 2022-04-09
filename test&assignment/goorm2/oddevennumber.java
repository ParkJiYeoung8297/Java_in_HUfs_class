package goorm2;

import java.util.*;
class oddevennumber {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers :");
		int num = input.nextInt();
		
		
		System.out.println("Choose :");
		System.out.println("1. Odd numbers");
		System.out.println("2. Even numbers");
		
		System.out.print("Your choice :");
		int number = input.nextInt();
		if (number==1)
			for (int i =1;i <= num;i++)
		System.out.print(i * 2 - 1 + " ");
		else
			for (int j =1;j <= num;j++)
				System.out.print(j * 2 + " ");
		
		
		
		
		
		
		
		
		
		
	}
}