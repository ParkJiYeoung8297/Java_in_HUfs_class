package section04;

public class TestBreak {
	  public static void main(String[] args) {
	    int sum = 0;
	    int number = 0;

	    while (number < 20) {
	      number++;
	      sum += number;
	      if (sum >= 100) 
	        break;/////sum이 100이상이면 정지
	    }

	    System.out.println("The number is " + number);
	    System.out.println("The sum is " + sum);
	  }
	}