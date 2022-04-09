package finaltest;
import java.io.*;
class second {
	public static void main(String[] args) throws Exception {
	int matrix[][] = new int[3][3];

  for (int i = 0; i < matrix.length; i++){
    for (int j = 0; j < matrix[i].length; j++){
       matrix[i][j] = (int)(Math.random() * 10);
       System.out.print(matrix[i][j] + " ");
   }
    System.out.println();

   }
	}
}