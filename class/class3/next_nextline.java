package class3;

import java.util.Scanner;

public class next_nextline {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		////console은 이름일뿐
		////Scanner input 으로 쓰면 밑에 double num = input.nextDouble();로 쓰면 된다

	     System.out.print("Today temperature is: ");
	     double num = console.nextDouble(); // for example, 27
	     //int num = console.nextDouble();
	     //double num = console.nextInt();
	     System.out.print("What is your opinion? ");
	     String text1 = console.next(); //input "Cool. It is Spring Now" //next는 띄어쓰기 전까지만 출력 즉 Cool.까지 출력
	     String text2 = console.nextLine();   ///nextline은 엔터 값을 포함하고 있음 입력 받기위해 대기 하지 않음
	     //앞에 대기 하는 nextInt,nextdouble,next등을 써야 nextline 이 작동가능 
	     ///띄어쓰기 전까지는 저 3개로 출력되고 나머지는 nextline 으로 다음줄에 출력
	     
	     
	     System.out.println("Temperature is: "+num);
	     System.out.println(text1);
	     System.out.println(text2);
	}

}
