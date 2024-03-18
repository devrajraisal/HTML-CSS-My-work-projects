package OOpTASks;

import java.util.Random;
import java.util.Scanner;

public class IntenT1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int attempts = 10;
            int score = 0;

            System.out.println("Welcome to the Number Guessing Game!");

            do {
                int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("A random number between 1 and 100 has been generated. You have " + attempts + " attempts.");

                for (int attempt = 1; attempt <= attempts; attempt++) {
                    System.out.print("Enter your guess: ");
                    int userGuess = input.nextInt();

                    if (userGuess == randomNumber) {
                        System.out.println("Congratulations! You guessed the correct number.");
                        score++;
                        break;
                    } else if (userGuess < randomNumber) {
                        System.out.println("Too low. Try again.");
                    } else {
                        System.out.println("Too high. Try again.");
                    }

                    if (attempt == attempts) {
                        System.out.println("Out of attempts. The correct number was: " + randomNumber);
                    }
                }

                System.out.print("Do you want to play again? (yes/no): ");
            } while (input.next().equalsIgnoreCase("yes"));

            System.out.println("Game over. Your total score is: " + score);
        }
}
