package goorm2;
import java.io.*;
import java.util.*;
class array1 {
public static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456};
		 //Put your code here
      System.out.println(my_array1[0]==1789);
		 //What would be the best statement to result "true"?
      System.out.println(my_array1[1]==2034);
		 //What would be the best statement to result "false"?
   }
}