package goorm2;
import java.io.*;
import java.util.*;
class calculatesales {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many customers? ");
		int num = input.nextInt();
		
		int[] sales = new int[num];
		inputsales(sales);
		//calculate the total sales + the average sales per person
		calculate(sales);
	}
	
	public static void inputsales(int[] sales){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<sales.length; i++){
			System.out.print("input the payment of customer " + i + ":");
			sales[i] = input.nextInt();
		
			
		}
	}
	
	public static void calculate(int[] sales){
	  //write your solutions in this s
		int total=0;
		int i=0;
		while (i<sales.length){
		total+=sales[i];
		i++;
			}
		double average =(double)total /sales.length;
		System.out.println("the total sales : " + total);
		System.out.println("the average sales per customer : " + average);
		
	}
	
}