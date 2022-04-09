package goorm1;

import java.util.*;
class metertomillimeter {
	public static void main(String[] args) throws Exception {
		Scanner console = new Scanner(System.in);
		System.out.print("Input your height in meter: ");
		double yourheight = console.nextDouble();
		int height = (int)(yourheight * 1000);
		System.out.println("The height in mm is "+ height +" millimeter");
		
		
	}
}