package section08;

import java.util.Scanner;

//A Student Main Class.
public class StudentMain{
 public static void main (String[] args){

	Scanner input = new Scanner(System.in);
     System.out.print("How many students? ");
     int numOfStu = input.nextInt();
	 Student[] stu = new Student[numOfStu];
     double total = 0.0;
     int index=0;
     double max=0;
		   for(int i = 0; i< numOfStu; i++){
         String name = input.next();
         double gpa = input.nextDouble();
         stu[i] = new Student(name, gpa);
         total += gpa;
         if(gpa > max){   ///이건 최대값 갱신
             index = i;   
             max = Math.max(max, gpa);
         }
     }
     
     System.out.println("The student with the best GPA is "+stu[index].getName());
     System.out.printf("The average GPA is : %.2f", (total / numOfStu));  

 }
}

 

