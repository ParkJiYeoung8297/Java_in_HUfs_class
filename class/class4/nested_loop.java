package class4;

public class nested_loop {
//////for�� �ȿ� for��(�ݺ����ȿ� �ݺ���)
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {    ////row
		    for (int j = 1; j <= 10; j++) {    //column
		        System.out.print("*");
		        ////print�ϱ� �̰� ���ٿ� *����Ʈ 10�� �ݺ��̰�
		    }
		    System.out.println();   
		    //println�̴ϱ� �ȿ� �ִ� for�� �� �ٲ㼭 5�� �ݺ� 
		}
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print(j);
		    }
		    System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print(i);
		    }
		    System.out.println();
		}

	}

}
