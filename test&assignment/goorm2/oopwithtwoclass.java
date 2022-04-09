package goorm2;

import java.io.*;
import java.util.*;
class oopwithtwoclass//client
	public static void main(String[] args) throws Exception {
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
         if(gpa > max){
             index = i;   
             max = Math.max(max, gpa);
         }
     }
     
     System.out.println("The student with the best GPA is "+stu[index].getName());
     System.out.printf("The average GPA is : %.2f", (total / numOfStu)); 
	}
}

// A Student object represents a name and GPA.
class Student{ //student class
    private String name;
    private double gpa;
    
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    
    public String getName() {
        return name;
    }
    
    public double getGPA() {
        return gpa;
    }
    
    public void setName(String name) {
        this.name = name; 
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
}
