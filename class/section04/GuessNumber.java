package section04;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
	    // Generate a random number to be guessed
	    int number = (int)(Math.random() * 101);
	    ////1����100���� 1001�̸� 1���� 1000����
	    //Random random = new Random();
	    //int MIN = 1;
        //int MAX = 100;
        //int number = random.nextInt(MAX - MIN + 1) + MIN;
	    ///���� ��Ÿ���� 2�� ǥ�� �ܿ��
	    
	    Scanner input = new Scanner(System.in);
	    System.out.println("Guess a magic number between 0 and 100");

	    int guess = -1;
	    while (guess != number) {
	      // Prompt the user to guess the number
	      System.out.print("\nEnter your guess: ");
	      guess = input.nextInt();

	      if (guess == number)
	        System.out.println("Yes, the number is " + number);
	      else if (guess > number)
	        System.out.println("Your guess is too high");
	      else
	        System.out.println("Your guess is too low");
	    } // End of loop
	  }

    }

