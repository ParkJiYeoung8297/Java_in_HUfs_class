package goorm1;
import java.util.*;
public class nestedloop {
	public static void main(String[] args) throws Exception {
		 Scanner input = new Scanner(System.in);
		 int num = input.nextInt();
		for(int i = 1;i <= num; i++){
			for(int j =1;j <= i;j++){
				System.out.print(j * (-1) + 1 + num);
			}System.out.println();
		}
		
	}
}