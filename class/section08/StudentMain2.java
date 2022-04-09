package section08;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain2 {

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
	    ArrayList<Student> stu = new ArrayList<Student>();
	    double total = 0.0;
	    int index=0, i=0;
	    double max=0;
		while(true)
	    {
			System.out.print("Name: ");
			 String name = input.next();
			 System.out.print("GPA: ");
			 double gpa = input.nextDouble();
	         
	    	stu.add(new Student(name, gpa));
	    	total += gpa;
	         if(gpa > max){
	             index = i;   
	             max = Math.max(max, gpa);
	         }
	         i++;
	         System.out.print("Continue ?");
	         String in = input.next();
	         if(in.equalsIgnoreCase("no"))
	        	 break;
	    }
    
	     System.out.println("The student with the best GPA is "+stu.get(index).getName());
	     System.out.printf("The average GPA is : %.2f \n", (total / stu.size())); 
	     System.out.println("Check grade :" + Student.checkGPA(stu.get(index).getGPA()));
	     
	 }
}
