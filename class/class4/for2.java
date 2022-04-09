package class4;

public class for2 {

	public static void main(String[] args) {
		//int i;
		//for (i =1;i<=5;i++)     >>>위에서 i 정의했으면 for 구문에서 쓸떄 같은 i 정의 못함
									/////for(int i =1;i<=5;i++)  --- >  X
		//System.out.println(i);
		//----------------------		
		//위에서 정의 안했다면 밑처럼 서로 다른 for구조문에서는 같은 i 사용가능
		for (int i=1;i<=10;i++) {
			System.out.println(i);
			}
		for(int i =1;i<=20;i++)
			System.out.println(i);
	}
	
	
	
}
