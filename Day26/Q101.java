
import java.util.Random;
import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number = random.nextInt(100)+1;
        int guess;
        System.out.println("Guess a number between 1 to 100");
        do { 
            System.out.println("Enter your guess:");
            guess = input.nextInt();
            if(guess < number){
                System.out.println("Too low!!");
            }
            else if(guess > number){
                System.out.println("Too High!!");
            }
            else{
                System.out.println("Correct! You guessed number.");
            }
        } while (guess != number);
    }
}
