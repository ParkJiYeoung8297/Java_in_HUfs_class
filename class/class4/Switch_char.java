package class4;

import java.util.Scanner;

public class Switch_char {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		  System.out.print("How many kids do you have? ");
		  
		  char a = 'B';
			a ='b';
			System.out.println(a);
		  a = input.next().charAt(0);
		  switch(a) {
		 
		    case 'a': System.out.println("You must be very happy");
		       break;
		    case 'b': System.out.println("Perfect");
		       break;
		    case 'c': System.out.println("That's awesome");
		       break;
		    case 'd': System.out.println("You are powerful");
		      break;
		    default: System.out.println("WOW");
		  }
	}

}

