
import java.awt.*;
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!, Please enter a number between 1 and 100");

        do {
            userGuess = input.nextInt();
            numberOfTries++;
            if (userGuess > numberToGuess) {
                System.out.println("Try a lower number");
            } else if (userGuess < numberToGuess) {
                System.out.println("Try a higher number");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries");
            }
        } while (userGuess != numberToGuess);
    }
}
