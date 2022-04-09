package goorm1;

import java.util.*;
class loopsummation {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int sum=0;
		int num=0;
		String answer = "yes";
		
		while(answer.equals("yes")){
			System.out.print("Input any number :");
			num = input.nextInt();
			System.out.print("Input again? (yes/no)");
			answer = input.next();
			sum += num;			
		}
		
		System.out.println("The total from the input is :" + sum);
	}
}