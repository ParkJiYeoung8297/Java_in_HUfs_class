package section04;

import java.util.*;

public class CumSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i=1; i<=5;i++) {
			System.out.print("Type a number :");
			sum = sum + input.nextInt();
			///input.nextInt()r가 입력 받는 정수 말하는거
		}
		System.out.println("The sum is " + sum);

	}

}
