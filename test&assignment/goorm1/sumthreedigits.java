package goorm1;
import java.util.*;
public class sumthreedigits {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Input three digit integer number: ");
		int num = input.nextInt();
		int number = num;
		int total = 0;
		while (number != 0){
			total += (number % 10);
			number /= 10;
		}
		
		System.out.println("Total number of "+num+ " = "+total);
		
		
	}
}