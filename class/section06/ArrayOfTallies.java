package section06;

import java.util.Arrays;

public class ArrayOfTallies {

	public static void main(String[] args) {
		int num = 229231007;
		int[] counts = new int[10];
		while (num > 0) {
		    // ���� �ڸ����� ���� ������ ���ڰ� ��ִ��� Ȯ���ϴ°��� 
		    int digit = num % 10; ///ex) ù° ������ 7(���� ����)
		    counts[digit]++; 	///array[7]���ٰ� +1�� �Ѵ�
		    num = num / 10;  ////������ 22923100�� ���� �ٽ� ���� �ö� ���� �ڸ��� ���� Ȯ���ϴ°� �ݺ�
		}
		
		System.out.println("Result : "+Arrays.toString(counts)); ///array.toString�� array�� string���� ��ȯ�Ͽ� �����ϴ� ����


	}

}
