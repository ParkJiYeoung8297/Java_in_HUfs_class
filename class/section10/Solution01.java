package section10;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		//input
		Scanner input = new Scanner(System.in);
		System.out.print("How many Customer? ");
		int cust = input.nextInt();
		int[][] sales = new int[5][5];
		int total = 0;
		
		//processing
		for(int i = 1;i<= cust; i++) { //total customer
			
			for(int j=1;j <=3; j++) {
				//table
				if(j ==1) {
					System.out.print("Customer "+i+ " ");
					System.out.print("How many table?");
					sales[i][j] = input.nextInt();
					total = total + (sales[i][j] * 50000);
				} else if (j == 2) {
					System.out.print("Customer "+i+ " ");
					System.out.print("How many chair?");
					sales[i][j] = input.nextInt();
					total = total + (sales[i][j] * 25000);
				//chair
				} else if (j == 3) {
				//cabinet	
					System.out.print("Customer "+i+ " ");
					System.out.print("How many cabinet?");
					sales[i][j] = input.nextInt();
					total = total + (sales[i][j] * 60000);
					
				}
			}
			
		}
		
		
		//output
		System.out.println("Total sales : "+total);

	}

}
