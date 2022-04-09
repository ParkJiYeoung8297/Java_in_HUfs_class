package class4;

import java.util.Scanner;

public class Switch_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		  System.out.print("How many kids do you have? ");
		  int num = input.nextInt();
		  /////switch(num) 이면 num 정의가 int 니까case 1,2,3,4 switch(ch)일때2 ch 정의가 문자이면 case a,b,c,d
		  switch(num) {
		  ////switch() 괄호 안에는 case 몇번째꺼 해야하는 지 쓰는 거임
		  ////여기서는 입력받는 값  num을 썼으므로 ex)로 2를 입력하면 case2가 수행이됨
		  //////문자를 사용하는 경우에 case 'a' 이런식으로 작은 따옴표 있어야함.
		    case 1: System.out.println("You must be very happy");
		       break;
		    case 2: System.out.println("Perfect");
		       break;
		    case 3: System.out.println("That's awesome");
		       break;
		    case 4: System.out.println("You are powerful");
		       break;
		    default: System.out.println("WOW");
		  }
	}

}
