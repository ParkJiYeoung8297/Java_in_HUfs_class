package section08;

//A Student object represents a name and GPA.
public class Student{
 private String name;
 private double gpa;
  public Student(String name, double gpa) { 
	  this.name = name; ///this.name ��array���� name ���� ���ڴ�(mutator) 
	  this.gpa = gpa; }
 
	 
 
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
 

	/*
	 * public static String checkGPA(double gpa) { String grade=""; if (gpa>3.5)
	 * grade = "Excelent"; else grade = "General"; return grade; }
	 */
	 
}
