package section05;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = input.nextInt();
////최대 공약수 구하기
    System.out.println("The greatest common divisor for " + n1 +
      " and " + n2 + " is " + gcd(n1, n2));
  }

  /** Return the gcd of two integers */
  public static int gcd(int n1, int n2) {////////void가 아니기때문에 return을 꼭 붙여줘야함.
    int gcd = 1; // Initial gcd is 1
    int k = 1; // Possible gcd
    
    while (k <= n1 && k <= n2) {
      if (n1 % k == 0 && n2 % k == 0)
        gcd = k; // Update gcd  //만족하는 값이 나오면 갱신  아니면 그대로 so최대 공약수 구할수 있다
      k++;
    }

    return gcd; // Return gcd void아니라// int 이므로 return써줌
  }
}
