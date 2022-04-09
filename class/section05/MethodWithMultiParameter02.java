package section05;

import java.util.Scanner;

public class MethodWithMultiParameter02 {
///////////// 맨 처음 exit를 넣었을 때 왜 printTheName 은 실행되지 않고 while 은 실행 되는 지 구하기
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";///while 함수 들어갈때 name 값 써야 하기 때문에 여기서 꼭 초기화 시켜줘야함
		int batch; //여기서는 초기화 안되있어서 밑에서 input 값으로 받는거 써줘야함(초기화 시켜줘야함)
		
		while(!name.equalsIgnoreCase("exit")){	///맨처음 name 초기화값이 ""이기때문에 while 함수에 있는 내용은 실행됨	
			System.out.print("Input your name :");///맨처음 exit를 입력해도 while은 실행되나 printTheName 함수는 if조건에 부합하지 않아 실행되지 않음
			name = input.next();
			System.out.print("Input your batch : ");// The year you enter university
			batch = input.nextInt();
			printTheName(name, batch);
		}
		System.out.println("Thank you!");
	}
	
	public static void printTheName(String n, int batch) {
		if(!n.equalsIgnoreCase("exit")) {
		  System.out.print(n);
		  System.out.print(" is a good Name ");
		  System.out.println("in the batch of "+batch);
		}
	}
}
