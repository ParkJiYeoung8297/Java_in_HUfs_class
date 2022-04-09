package section05;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number:");
		int i = sign(input.nextInt());
		System.out.println(i);
	}
	public static int sign(int n) {
		if(n>0)
			return 1;
		else if (n==0)
			return 0;
		else
			return -1;
	}
}
