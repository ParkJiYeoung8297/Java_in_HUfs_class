package class4;

import java.util.Scanner;

public class equal_equalsIgnore {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input first word:");
		String word1 = console.next();
		System.out.print("Input second word:");
		String word2 = console.next();
		////char �� ���� �ϳ��϶� char a = console.next().charAt(0);
		////String �� ���ڿ� String word2 = console.next();
		///�� ���� ���� ���ٷ� �и�����
		/////char a;  >���� �����ϰ�
		/////a = console().charAt(0);   >�̶��� ������ ���� ������ a �տ� char �Ⱥ���.
		////nextInt();   nextDouble();  next();  next().charAt(0);
		if (word1 == word2)
			System.out.println("1. Same word");
		/////==��ȣ�� ���ڸ� �����̹Ƿ� 1���� ����Ʈ�ɼ�����
		if (word1.equals(word2))
			System.out.println("2. Same word");
		if (word1.equalsIgnoreCase(word2))
			System.out.println("3. Same word");
		if ("Hello".equals(word2))
			System.out.println("4. Same word");
		
	}

}
