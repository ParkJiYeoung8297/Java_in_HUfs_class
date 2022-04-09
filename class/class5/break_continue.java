package class5;

public class break_continue {

	public static void main(String[] args) {
		for(int i = 1;i <= 5;i++) {
		if(i == 3) 
		break;   /////i=3 이면 종료
		
		System.out.println(i);
		///for>if>print>for>if>print......
		}
		for(int i = 1;i <= 5;i++) {
			if(i == 3) 
			continue;////처음으로 돌아가기
			System.out.println(i);
			
			}
		

	}
}