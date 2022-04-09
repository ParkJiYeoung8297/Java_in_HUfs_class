package section04;

import java.util.*;

public class FibonacciNumbers {

	public static void main(String[] args) {
		//initial values
		int f1=0, f2 = 1;
		
		//input
		Scanner input = new Scanner(System.in);
		System.out.print("Input n of Fibonacci number :");
		int num = input.nextInt();
		
		for(int i = 1; i<=num;i++) {
			System.out.print(f2 + " ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}

	}

}
