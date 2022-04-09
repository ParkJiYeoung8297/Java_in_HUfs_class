package section05;

public class MethodWith1Parameter01 {

	public static void main(String[] args) {
        nPrintln("Welcome to Java");
        /////nPrintln 에 반복문 있으므로 Welcome to Java를 밑에 for문에 의해 3번 반복하고 밑줄가기
        
        nPrintln("Computer Science");
	}
	
	public static void nPrintln(String message) {  
		  for (int i = 0; i < 3; i++)
		    System.out.println(message);
	}
}
