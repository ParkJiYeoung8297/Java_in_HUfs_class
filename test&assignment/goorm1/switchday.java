package goorm1;
import java.util.Scanner;
public class switchday {
    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();
        
		    String dayName = "";
		    // modify the area below to answer the problem
        switch(day) {
            case 1 : dayName = "Monday"; break;
            case 2 : dayName = "Tuesday"; break;
            case 3 : dayName = "Wednesday"; break;
            case 4 : dayName = "Thursday"; break;
            case 5 : dayName = "Friday"; break;
            case 6 : dayName = "Saturday"; break;
            case 7 : dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        System.out.println(dayName);
    }
}