package section07;

public class CountLettersInArray {
	  /** Main method */
	  public static void main(String[] args) {
	    // Declare and create an array
	    char[] chars = createArray();

	    // Display the array
	    System.out.println("The lowercase letters are:");
	    displayArray(chars); 
	    ///요 함수?안에 array 인 chars 가 들어갔으니 밑에 displayArray에서parameter정의할때 array 정의 형태로 해주어야함

	    // Count the occurrences of each letter
	    int[] counts = countLetters(chars);

	    // Display counts
	    System.out.println();
	    System.out.println("The occurrences of each letter are:");
	    displayCounts(counts);
	  }

	  /** Create an array of characters */
	  public static char[] createArray() {
	    // Declare an array of characters and create it
	    char[] chars = new char[100];

	    // Create lowercase letters randomly and assign
	    // them to the array
	    for (int i = 0; i < chars.length; i++)
	      chars[i] = RandomCharacter.getRandomLowerCaseLetter();
	    // Return the array
	    return chars;
	  }

	  /** Display the array of characters */
	  public static void displayArray(char[] chars) {
	    // Display the characters in the array 20 on each line
		  ///20으로 나누어질때 println 이니까 20개씩 쓰는거
	    for (int i = 0; i < chars.length; i++) {
	      if ((i + 1) % 20 == 0)
	        System.out.println(chars[i]);
	      else
	        System.out.print(chars[i] + " ");
	    }
	  }

	  /** Count the occurrences of each letter */
	  public static int[] countLetters(char[] chars) {
	    // Declare and create an array of 26 int
	    int[] counts = new int[26];

	    // For each lowercase letter in the array, count it
	    for (int i = 0; i < chars.length; i++)
	      counts[chars[i] - 'a']++;

	    return counts;
	  }

	  /** Display counts */
	  public static void displayCounts(int[] counts) {///괄호안 parameter가 array 정의 됐으므로 위에서 이  메서드 쓸때 괄호안에 array 넣어야함
	    for (int i = 0; i < counts.length; i++) {
	      if ((i + 1) % 10 == 0)
	        System.out.println(counts[i] + " " + (char)(i + 'a'));
	      else
	        System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
	    }
	  }
	}