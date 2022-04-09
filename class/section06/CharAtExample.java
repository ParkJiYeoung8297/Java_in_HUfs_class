package section06;

import java.util.Scanner;

public class CharAtExample {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		String word = console.next(); /////string 은 문자열이고 char 은 문자 하나임
		char firstLetter = word.charAt(0); ///0칸에 있는 문자 하나 말하는거
		if (firstLetter == 'c') {
		    System.out.println("That's good enough for me!");
		}	

	}

}
