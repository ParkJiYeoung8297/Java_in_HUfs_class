package section05;

public class MethodWithMultiParameter01 {

	public static void main(String[] args) {
        nPrintln("Welcome to Java", 3); ///밑에가서 for문 거치고 밑에줄 가기
        nPrintln("Computer Science", 7);/////(7,"Computer Science")>>이러면 밑에 nprintln방법과 순서 달라서 에러
	}
	
	public static void nPrintln(String message, int n) {  ///main 폴더에서 어떤값들 받을건지 정의해놓기
		  for (int i = 0; i < n; i++)						////String 값과 int 값 받겠다(순서 바뀌면 안됨)
		    System.out.println(message);
	}


}
