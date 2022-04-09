package class4;

import java.util.Scanner;

public class equal_equalsIgnore {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input first word:");
		String word1 = console.next();
		System.out.print("Input second word:");
		String word2 = console.next();
		////char 은 문자 하나일때 char a = console.next().charAt(0);
		////String 은 문자열 String word2 = console.next();
		///또 위에 저건 두줄로 분리가능
		/////char a;  >먼저 정의하고
		/////a = console().charAt(0);   >이때는 위에서 정의 했으니 a 앞에 char 안붙임.
		////nextInt();   nextDouble();  next();  next().charAt(0);
		if (word1 == word2)
			System.out.println("1. Same word");
		/////==기호는 숫자만 가능이므로 1번은 프린트될수없음
		if (word1.equals(word2))
			System.out.println("2. Same word");
		if (word1.equalsIgnoreCase(word2))
			System.out.println("3. Same word");
		if ("Hello".equals(word2))
			System.out.println("4. Same word");
		
	}

}
