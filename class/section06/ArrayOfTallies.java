package section06;

import java.util.Arrays;

public class ArrayOfTallies {

	public static void main(String[] args) {
		int num = 229231007;
		int[] counts = new int[10];
		while (num > 0) {
		    // 끝에 자리부터 떼서 각각의 숫자가 몇개있는지 확인하는거임 
		    int digit = num % 10; ///ex) 첫째 나머지 7(끝에 숫자)
		    counts[digit]++; 	///array[7]에다가 +1을 한다
		    num = num / 10;  ////다음은 22923100이 남고 다시 위로 올라가 끝에 자리를 떼서 확인하는거 반복
		}
		
		System.out.println("Result : "+Arrays.toString(counts)); ///array.toString은 array를 string으로 변환하여 나열하는 것임


	}

}
