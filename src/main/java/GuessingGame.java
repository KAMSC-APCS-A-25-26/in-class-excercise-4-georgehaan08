import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int actual = rand.nextInt(100);
        int guess;
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        do
        {
            System.out.println("Enter your guess! ");
            guess = sc.nextInt();
            if(guess < actual)
            {
                System.out.println("Too low! Try again.");
            }
            else if(guess > actual)
            {
                System.out.println("Too high! Try again.");
            }
        } while (guess != actual);
        System.out.println("You got it!");
    }
}

