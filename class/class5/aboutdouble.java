package class5;

import java.util.Scanner;

public class aboutdouble{

	public static void main(String[] args) {
		System.out.println("Selection");
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Faherenheit");
		System.out.print("Your choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		if (choice == 1) {
		System.out.print("Input the degree of Farenheit: ");
		int temperature = input.nextInt();
		String category;
		double degree = (temperature - 32) * 5/9;
			if (degree >= 30)
			category = "Hot";
			else if (degree >=10)
			category = "Cool";
			else
			category = "Cold";
			
			System.out.println("The degree of Celsius is " + degree);
			System.out.println("It is " + category);
		}
		else {
			System.out.print("Input the degree of Celsius: ");
			int temperature = input.nextInt();
			String category;
			double degree = (double)temperature * 9 / 5 + 32; ////(double)이 있어야 소수점이 뒤에 값이 나옴
			////왜냐면 temperature값이 int로 정의 되있기 떄문에 (double) 안쓰면 정수값.0이 나옴
			if (degree >= 86)
			category = "Hot";
			else if (degree >=50)
			category = "Cool";
			else
			category = "Cold";
			System.out.println("The degree of Faherenheit is " + degree);
			System.out.println("It is " + category);
		}
		System.out.println("Thank you!");
		
	}

}
