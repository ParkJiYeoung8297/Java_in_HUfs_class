package class4;

import java.util.Scanner;

public class Switch_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		  System.out.print("How many kids do you have? ");
		  int num = input.nextInt();
		  /////switch(num) �̸� num ���ǰ� int �ϱ�case 1,2,3,4 switch(ch)�϶�2 ch ���ǰ� �����̸� case a,b,c,d
		  switch(num) {
		  ////switch() ��ȣ �ȿ��� case ���°�� �ؾ��ϴ� �� ���� ����
		  ////���⼭�� �Է¹޴� ��  num�� �����Ƿ� ex)�� 2�� �Է��ϸ� case2�� �����̵�
		  //////���ڸ� ����ϴ� ��쿡 case 'a' �̷������� ���� ����ǥ �־����.
		    case 1: System.out.println("You must be very happy");
		       break;
		    case 2: System.out.println("Perfect");
		       break;
		    case 3: System.out.println("That's awesome");
		       break;
		    case 4: System.out.println("You are powerful");
		       break;
		    default: System.out.println("WOW");
		  }
	}

}
