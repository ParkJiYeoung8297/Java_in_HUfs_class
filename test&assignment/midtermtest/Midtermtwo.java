package midtermtest;

import java.util.Scanner;

public class Midtermtwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=1;
		int sum = 0;
		int summ=0;		while (number!=0) {
			System.out.print("Input number: ");
			number=input.nextInt();
			sum=sum+number;
			summ=summ+Math.abs(number);
			
		}
			System.out.print("Do summation with absolute?");
			String answer = input.next();
			if (answer.equalsIgnoreCase("yes"))
				System.out.println("The summation is " + summ);
			else
				System.out.println("The summation is " + sum);
	}

}
