package section10;

import java.util.Scanner;

public class Solution02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many customers? ");
		int cust = input.nextInt();
		int total = 0;
		
		Customer[] sales = new Customer[cust+1]; //3 customers, 0, 1, 2
		
		for (int i= 1;i<= cust; i++) {
			System.out.print("Customer "+ i + " ");
			System.out.print("How many table :");
			int table = input.nextInt();
			
			System.out.print("Customer "+ i + " ");
			System.out.print("How many chair :");
			int chair = input.nextInt();
			
			System.out.print("Customer "+ i + " ");
			System.out.print("How many cabinet:");
			int cabinet = input.nextInt();
			
			sales[i] = new Customer(table, chair, cabinet);
			total = total + sales[i].getTotal();
		
		}
		
		System.out.println("Total sales : " + total);


	}

}

class Customer{
	private int qTable;
	private int qChair;
	private int qCabinet;
	private final int pTable = 50000;
	private final int pChair = 25000;
	private final int pCabinet = 60000;
	
	public Customer(int table, int chair, int cabinet) {
		this.qTable = table;
		this.qChair = chair;
		this.qCabinet = cabinet;
	}
	
	public int getTotal() {
		return (pTable * qTable) + (pChair * qChair) + (pCabinet * qCabinet);	}
	
}
