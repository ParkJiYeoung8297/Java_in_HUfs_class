package goorm2;
import java.util.*;
public class calculatedistance {
	public static void main(String[] args) throws Exception {
		Scanner insert = new Scanner(System.in);
		
	System.out.print("Input x1 : ");
		int x1 = insert.nextInt();
		System.out.print("Input y1 : ");
		int y1 = insert.nextInt();
		System.out.print("Input x2 : ");
		int x2 = insert.nextInt();
		System.out.print("Input y2 : ");
		int y2 = insert.nextInt();
		double distance= Math.pow((y2 - y1),2) + Math.pow((x2 - x1),2);
		
		System.out.println("The distance between " + x1 +","+y1+" and "+x2+","+y2+ " is "+ Math.pow(distance,0.5));
		
	}
}