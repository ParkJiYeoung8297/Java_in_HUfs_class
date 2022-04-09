package section06;

public class AnalyzeNumbers {
	  public static void main(String[] args) {
	    java.util.Scanner input = new java.util.Scanner(System.in);  ///import문 사용하지 않고 클래스내에서 외부 클래스 참조
	    System.out.print("Enter the number of items: ");
	    int n = input.nextInt();
	    double[] numbers = new double[n];
	    double sum = 0;

	    System.out.print("Enter the numbers: ");
	    for (int i = 0; i < n; i++) {
	      numbers[i] = input.nextDouble();
	      sum += numbers[i];
	    }
	    
	    double average = sum / n;

	    int count = 0; // The numbers of elements above average
	    for (int i = 0; i < n; i++) 
	      if (numbers[i] > average)
	        count++; ////if 조건 해당할때 count가 1 늘어나므로 조건에 해당하는 개수 구하는 것임

	    System.out.println("Average is " + average);
	    System.out.println("Number of elements above the average is "
	      + count);
	  }
	}
