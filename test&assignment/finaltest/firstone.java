package finaltest;

import java.util.Scanner;

public class firstone {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Matrix Generation");
		System.out.println("Input the matrix size");
		System.out.print("The row size: ");
		int row=input.nextInt();
		System.out.print("The column size: ");
		int column=input.nextInt();
		System.out.println("Matrix:");
		int[][] array= new int[row][column];
		for(int i=0;i<=row-1;i++) {
		for(int j=0;j<=column-1;j++) {
			array[i][j]=(int)(Math.random() * 10);	
			System.out.print(array[i][j]+" ");
		}
		System.out.println(" ");
		}
		
		System.out.println("Calculation Result:");
		int total=0;
		for(int i=0;i<=row-1;i++) {
			int sum=0;
			for(int j=0;j<=column-1;j++) {
		System.out.print(array[i][j]+" ");
		sum+=array[i][j];
			}
			System.out.println("     "+sum);
			total+=sum;
			}
		
		System.out.println("Total: "+ total);
		System.out.printf("Average:%.2f",(double)total/(row*column));
	
		
	}
	
}
