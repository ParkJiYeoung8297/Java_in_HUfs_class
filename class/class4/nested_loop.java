package class4;

public class nested_loop {
//////for문 안에 for문(반복문안에 반복문)
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {    ////row
		    for (int j = 1; j <= 10; j++) {    //column
		        System.out.print("*");
		        ////print니까 이건 한줄에 *프린트 10번 반복이고
		    }
		    System.out.println();   
		    //println이니까 안에 있는 for문 줄 바꿔서 5번 반복 
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
