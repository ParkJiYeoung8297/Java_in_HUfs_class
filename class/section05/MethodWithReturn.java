package section05;

public class MethodWithReturn {

	public static void main(String[] args) {///void는 return 사용x
		System.out.println("Sum from 1 to 10 is " + sum(1, 10));
		System.out.println("Sum from 20 to 30 is " + sum(20, 30));
		System.out.println("Sum from 35 to 45 is " + sum(35, 45));
	}
	
	////int:return value type    sum:method name
	public static int sum(int i1, int i2) { //void이외는 return 사용 필수
	//int말고도 double,char등도 사용가능(메소드 타입과 return 타입이 같아야함 int 면 return옆 값도 int 값이어야함)
		int sum=0;
		for (int i=i1 ; i<=i2;i++){
			sum+=i;
		}
		return sum;  ////sum은 이름임 public static int num이라하면 return num; 해야함
		////break 는 반복문 탈출이고 return은 메소드 탈출이다
	}
}
