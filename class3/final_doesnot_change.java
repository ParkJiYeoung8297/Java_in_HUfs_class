package class3;

public class final_doesnot_change {

	public static void main(String[] args) {
		final double PI = 3.14159; ////final 을 앞에다 붙여서 정의 하면 저 값은 안 바뀌는 값이다
		  int radius;
		  radius = 5;
		  double area = radius * radius * PI;
		  System.out.println(area);

	}

}
