package class5;

public class break_continue {

	public static void main(String[] args) {
		for(int i = 1;i <= 5;i++) {
		if(i == 3) 
		break;   /////i=3 �̸� ����
		
		System.out.println(i);
		///for>if>print>for>if>print......
		}
		for(int i = 1;i <= 5;i++) {
			if(i == 3) 
			continue;////ó������ ���ư���
			System.out.println(i);
			
			}
		

	}
}