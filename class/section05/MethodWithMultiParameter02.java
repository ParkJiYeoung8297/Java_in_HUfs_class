package section05;

import java.util.Scanner;

public class MethodWithMultiParameter02 {
///////////// �� ó�� exit�� �־��� �� �� printTheName �� ������� �ʰ� while �� ���� �Ǵ� �� ���ϱ�
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";///while �Լ� ���� name �� ��� �ϱ� ������ ���⼭ �� �ʱ�ȭ ���������
		int batch; //���⼭�� �ʱ�ȭ �ȵ��־ �ؿ��� input ������ �޴°� �������(�ʱ�ȭ ���������)
		
		while(!name.equalsIgnoreCase("exit")){	///��ó�� name �ʱ�ȭ���� ""�̱⶧���� while �Լ��� �ִ� ������ �����	
			System.out.print("Input your name :");///��ó�� exit�� �Է��ص� while�� ����ǳ� printTheName �Լ��� if���ǿ� �������� �ʾ� ������� ����
			name = input.next();
			System.out.print("Input your batch : ");// The year you enter university
			batch = input.nextInt();
			printTheName(name, batch);
		}
		System.out.println("Thank you!");
	}
	
	public static void printTheName(String n, int batch) {
		if(!n.equalsIgnoreCase("exit")) {
		  System.out.print(n);
		  System.out.print(" is a good Name ");
		  System.out.println("in the batch of "+batch);
		}
	}
}
