package goorm2;
import java.util.*;
class calculateaverage {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int number = 0;
		int count = 0;
		while (num >= 0){
			System.out.print("Input a number: ");
		num = input.nextInt();
		if (num >= 0){
			number = number + num;
			count++;
		}
	
		}
		double Average = number / count;
		
		
		System.out.println("The Total is: " + number);
		System.out.println("The Average is: " + Average);
		
	}
}