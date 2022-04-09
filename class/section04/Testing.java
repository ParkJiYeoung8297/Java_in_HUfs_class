package section04;

public class Testing {

	public static void main(String[] args) {
		double item = 1; double sum = 0;
		while (item != 0) { // No guarantee item will be 0
		  sum += item; ///sum=sum+item
		  item -= 0.1; ///// item=item-0.1
		/////이렇게 하면 러닝 타임 초과로 결과가 안나옴
		///참고로 저 밑에 빨간 네모는 프로그램 종료임
		///그래서 여기에 프린트 해주면
		  System.out.println(item);
		}
		
		System.out.println(sum);

	}

}
