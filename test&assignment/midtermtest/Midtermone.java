package midtermtest;

import java.util.Scanner;

public class Midtermone {

	public static void main(String[] args) {
		System.out.println("Selection");
		System.out.println("1. Summation");
		System.out.println("2. Factorial");
		System.out.println("Your choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		System.out.println("Input the sequence number:");
		int number = input.nextInt(); 
		int i,j;
		if (choice==1) {
			int sum=0;
			for(i=1;i<=number;i++) {
				System.out.print(i + " ");
				sum = sum + i;
			}
			System.out.println("The summation is " + sum);
				if (sum>=100) 
					System.out.println("It is a number higher than 100");
					else
						System.out.println("It is a number lower than 100");
			
			}
			else {
				int factorial=1;
				for(j=1;j<=number;j++) {
				System.out.print(j + " ");
				factorial = factorial * j;
				}
				System.out.println("The factorial is " + factorial);
				if (factorial >=100) 
				System.out.println("It is a number higher than 100");
				else
					System.out.println("It is a number lower than 100");
			}
	}
	
}
