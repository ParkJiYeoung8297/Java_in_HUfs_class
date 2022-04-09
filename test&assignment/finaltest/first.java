package finaltest;
import java.io.*;
class first {
	public static void main(String[] args) throws Exception {
		int exp = exponent(2, 3);
		System.out.println(exp);
	}
	
	public static int exponent(int v1, int v2){
		int result = 1;
		result=(int)Math.pow(v1,v2);
		
		
		
		return result;
	}
}