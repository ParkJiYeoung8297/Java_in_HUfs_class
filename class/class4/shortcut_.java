package class4;

import java.util.Scanner;

public class shortcut_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y;
		
		
		if (x < 0)
			y = 1;
		else
			y = -1;
		System.out.println(y);
		
		///////�������� shortcut �� ������ �Ѱ� �ؿ� ����
		y = (x < 0)? 1:-1;
		System.out.println(y);
		

	}

}



