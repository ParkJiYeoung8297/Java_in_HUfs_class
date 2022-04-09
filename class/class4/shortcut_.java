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
		
		///////위에꺼를 shortcut 즉 간다히 한게 밑에 거임
		y = (x < 0)? 1:-1;
		System.out.println(y);
		

	}

}



