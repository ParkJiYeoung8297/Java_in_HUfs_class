package section06;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
		int[] e = {0, 2, 4, 6, 8};
		  e[1] = e[3] + e[4]; //////���ʿ� �ִ� e[1]�� ���ŵ�
		  System.out.println("e is " + Arrays.toString(e)); //array.tostring�ϸ� array�� [ , ,]���·� ����


	}

}
