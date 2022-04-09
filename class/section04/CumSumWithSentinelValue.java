package section04;

import java.util.Scanner;

public class CumSumWithSentinelValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
		while (num >=0) {  /////괄호안에 식이 True일때 밑에 수행
			System.out.print("Type a number :");
			num = input.nextInt();
			sum = sum + num;
			////여기서 num<0일때 값을 sum에 안 더하고 싶다 싶으면 sum+=num 지우고 if break 사용
			//	if(num < 0)
			//	break;
			//	else 
			//	sum = sum + num;
				
			
		} 
		
		System.out.println("The sum is " + sum);
		//Can you improve the problem?

	}

}
