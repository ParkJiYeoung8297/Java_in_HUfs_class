package section05;

public class MethodWithMultiParameter01 {

	public static void main(String[] args) {
        nPrintln("Welcome to Java", 3); ///�ؿ����� for�� ��ġ�� �ؿ��� ����
        nPrintln("Computer Science", 7);/////(7,"Computer Science")>>�̷��� �ؿ� nprintln����� ���� �޶� ����
	}
	
	public static void nPrintln(String message, int n) {  ///main �������� ����� �������� �����س���
		  for (int i = 0; i < n; i++)						////String ���� int �� �ްڴ�(���� �ٲ�� �ȵ�)
		    System.out.println(message);
	}


}
