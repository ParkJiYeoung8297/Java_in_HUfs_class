package midtermtest;

import java.util.Scanner;

public class Midtermoneanswer {

	public static void main(String[] args) {
		System.out.println("Selection");
		System.out.println("1. Summation");
		System.out.println("2. Factorial");
		System.out.print("Your choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		System.out.print("Input the sequence number:");
		int number = input.nextInt(); 
		
		if (choice==1) {
			int total= summation(number);
		System.out.println("The summation is " + total);
		lowhigh(total);
	}
		else {
			int fac=factorial(number);
			System.out.println("The factorial is " + fac);
			lowhigh(fac);
		}
	}
	
	public static int summation(int n) {
	int sum = 0;
	for (int i=1;i<=n;i++) {
		System.out.print(i + " ");
		sum+=i;
		}
	System.out.println();
	return sum;
	}
	
	public static int factorial(int n) {
		int fac=1;
		for(int i=1;i<=n;i++){/////for(); �ϸ� �ؿ��� i���� �ʱ�ȭ(����) �ٽ� ����� �� so �׹����� for()�ڿ�;����!!
			System.out.print(i + " ");
			fac*=i;
			}
		System.out.println();
		return fac;
	}
	
	
	public static int lowhigh(int n) {
		if(n<=100)
			System.out.println("It is a number lower than 100");
		else
			System.out.println("It is a number higher than 100");
		return n;
	}
}
