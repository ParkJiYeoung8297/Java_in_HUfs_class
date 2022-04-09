package goorm2;
import java.io.*;
class array2 {
	public static void main(String[] args) throws Exception {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
							//we need to check if the element i equals to element j, and i does not equal to j.
                if (my_array[i]==my_array[j]&&i!=j) 
								{
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }    
}