package finaltest;
import java.io.*;
class five {
	public static void main(String[] args) throws Exception {
			Calculator cal = new Calculator(5 , 4);
		  System.out.println(cal.calculate());
		  System.out.println(cal.calculates());
		
	}
}

class Calculator{
	int num1;
	int num2;
	
	public Calculator(int n1, int n2){
		num1 = n1;
		num2 = n2;
	}
	
	public int calculate(){
		return num1 + num2;
	}
	
	public double calculates(){
		return num1 - num2;
	}
	
}