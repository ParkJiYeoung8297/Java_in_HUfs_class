package section05;

public class MethodWith1Parameter01 {

	public static void main(String[] args) {
        nPrintln("Welcome to Java");
        /////nPrintln �� �ݺ��� �����Ƿ� Welcome to Java�� �ؿ� for���� ���� 3�� �ݺ��ϰ� ���ٰ���
        
        nPrintln("Computer Science");
	}
	
	public static void nPrintln(String message) {  
		  for (int i = 0; i < 3; i++)
		    System.out.println(message);
	}
}
