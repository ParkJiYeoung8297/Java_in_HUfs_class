package goorm2;

import java.util.*;
class highestnumber {
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int highest = 0;
		
		while(num >= 0  ){
			System.out.print("Input a number: ");
			num = input.nextInt();
			if (num >= highest )
				highest = num;
				
		}
		System.out.println("The highest number among the input is :" + highest);
	}
}