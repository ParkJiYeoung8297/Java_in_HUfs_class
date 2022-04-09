package finaltest;

import java.util.Scanner;

public class Exercise02 {
   public static void main(String[] args) {
      Scanner input  = new Scanner(System.in);
      System.out.print("Number of students : " );
        int numOfStu = input.nextInt();
        Student[] stu = new Student[numOfStu];
        
        int index = 0;
        int max = 0;
        int total = 0;
        
        for(int i = 0; i< numOfStu; i++){
           System.out.print("Student"+ (i+1) + " Name : ");
            String name = input.next();
            System.out.print("Student"+ (i+1) + " Score : ");
            int score =  input.nextInt();
            while( score >100 || score < 0) {//if문은 반복아 안됨
               System.out.print("Student"+ (i+1) + " Score : ");
                score =  input.nextInt();
            }
            stu[i] = new Student(name,score);
            total += score;
            if(score > max){ 
                max = Math.max(max, score);
                index = i; 
            }
            
         
        }
        System.out.println("The student with the best Score is "+ stu[index].getName());
        System.out.printf("The average Score is : " + (total / numOfStu));
        
        
    

   }
   

   }
   
       class Student{
      public Student(String name, int score) {
           this.name = name;
           this.score = score;
       }
      String studentName;
      int studentScore;
          private String name;
          private int score;
          
          public String getName() {
              return name;
          }
          
          public double getScore() {
              return score;
          }
          
          public void setName(String name) {
              this.name = name; 
          }

          public void setScore(int score) {
              this.score = score;
          }
      
   }

