package section06;

import java.util.Scanner;

public class CharAtExample {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		String word = console.next(); /////string �� ���ڿ��̰� char �� ���� �ϳ���
		char firstLetter = word.charAt(0); ///0ĭ�� �ִ� ���� �ϳ� ���ϴ°�
		if (firstLetter == 'c') {
		    System.out.println("That's good enough for me!");
		}	

	}

}
