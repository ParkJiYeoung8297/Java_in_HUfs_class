package section04;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber02 {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner input = new Scanner(System.in); 
        int MIN = 1;
        int MAX = 100;
        /// 범위 1부터 100까지
        ///범위 나타내는거 Guess01 에서 정리되있음 
        int comp = random.nextInt(MAX - MIN + 1) + MIN;
        int user;
        int guesses = 0;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            user = input.nextInt();/////이게 스캐너 nextInt임
            guesses++;
            if (user > comp)
                System.out.println("My number is less than " + user + ".");
            else if (user < comp)
                System.out.println("My number is greater than " + user + ".");
            else
                System.out.println("Well done! " + comp + " was my number! You guessed it in " + guesses + " guesses.");
        } while (user != comp);
    }
}
