package class5;

public class static_void_name {

	public static void main(String[] args) {
	///main 은 맨처음 있어야하는 것
	 message1();
	 message2();

	}

	/////그 다음부터는 내가 이름 붙이는 거
	public static void message1() {
		////main 괄호 안에 있는 message1 (약간 폴더 정리?같은 식인듯)
		///main에는 핵심만 딱 쓰고 그 자세한거는 이렇게 따로 폴더 만들면 간편하게 볼 수 있을 듯
		System.out.println("Good");
	}
	public static void message2() {
		System.out.println("Perfect");
	}
		
}	
