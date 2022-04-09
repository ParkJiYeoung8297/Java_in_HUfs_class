package section07;

public class Testjava {

	public static void main(String[] args) {
	    int x = 1; // x represents an int value
	    int[] y = new int[10]; // y represents an array of int values
	    m(x, y); // Invoke m with arguments x and y
	    System.out.println("x is " + x); /////x는 초기 입력값이 있으므로 1이다
	    System.out.println("y[0] is " + y[0]);///arrray 는 참조하여 값이 바뀜
	  }
	  public static void m(int number, int[] numbers) {
	    number = 1001; // Assign a new value to number
	    numbers[0] = 5555; // Assign a new value to numbers[0]


	}

}
