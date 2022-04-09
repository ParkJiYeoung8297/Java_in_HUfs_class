package section06;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
		int[] e = {0, 2, 4, 6, 8};
		  e[1] = e[3] + e[4]; //////왼쪽에 있는 e[1]만 갱신됨
		  System.out.println("e is " + Arrays.toString(e)); //array.tostring하면 array가 [ , ,]형태로 나옴


	}

}
