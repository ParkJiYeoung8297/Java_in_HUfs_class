package class3;

import java.util.Scanner;

public class dateswitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Today is: ");
		int num = input.nextInt();
		System.out.println("After: ");
		int numb = input.nextInt();
		int number = (num + numb) % 7;
		switch (number) {
		case 0:System.out.println("Monday");
		break;
		case 1:System.out.println("Tuesday");
		break;
		case 2:System.out.println("Wednesday");
		break;
		case 3:System.out.println("Thursday");
		break;
		case 4:System.out.println("Friday");
		break;
		case 5:System.out.println("Saturday");
		break;
		case 6:System.out.println("Sunday");
		break;
		}
		
	}

}
