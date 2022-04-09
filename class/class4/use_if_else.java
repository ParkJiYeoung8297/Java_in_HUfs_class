package class4;

import java.util.Scanner;

public class use_if_else {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("input ");
		int x = console.nextInt();
		if(x > 10) {
		System.out.println("Perfect");
		}	else if (x < 10) {
			System.out.println("Good");
		}	else if (x < -5) {
			System.out.println("normal");
		}	else {
			System.out.println("Bad");
		}
			
	}
		
}

////if>else if>else  마지막 else는 범위 x
///if(--){System.out.println();}
///


