package section04;

import java.util.Scanner;

public class CumSumWithSentinelValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
		while (num >=0) {  /////��ȣ�ȿ� ���� True�϶� �ؿ� ����
			System.out.print("Type a number :");
			num = input.nextInt();
			sum = sum + num;
			////���⼭ num<0�϶� ���� sum�� �� ���ϰ� �ʹ� ������ sum+=num ����� if break ���
			//	if(num < 0)
			//	break;
			//	else 
			//	sum = sum + num;
				
			
		} 
		
		System.out.println("The sum is " + sum);
		//Can you improve the problem?

	}

}
