package class3;

import java.util.Scanner;

public class next_nextline {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		////console�� �̸��ϻ�
		////Scanner input ���� ���� �ؿ� double num = input.nextDouble();�� ���� �ȴ�

	     System.out.print("Today temperature is: ");
	     double num = console.nextDouble(); // for example, 27
	     //int num = console.nextDouble();
	     //double num = console.nextInt();
	     System.out.print("What is your opinion? ");
	     String text1 = console.next(); //input "Cool. It is Spring Now" //next�� ���� �������� ��� �� Cool.���� ���
	     String text2 = console.nextLine();   ///nextline�� ���� ���� �����ϰ� ���� �Է� �ޱ����� ��� ���� ����
	     //�տ� ��� �ϴ� nextInt,nextdouble,next���� ��� nextline �� �۵����� 
	     ///���� �������� �� 3���� ��µǰ� �������� nextline ���� �����ٿ� ���
	     
	     
	     System.out.println("Temperature is: "+num);
	     System.out.println(text1);
	     System.out.println(text2);
	}

}
