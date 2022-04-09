package section05;

import java.util.Scanner;

public class ReturnWith1Parameter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input your number : ");
		int number = input.nextInt();
		int sum = sum(number);
		System.out.println("The summation is : "+sum);
	}
	
	public static int sum(int num) {
		int sum=0;
		for(int i = 0 ; i<=num;i++) {
			sum+=i;
		}
		return sum;
	}
	

}
