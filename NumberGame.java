import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("-----------------------------------");
        
        boolean playAgain = true;
        int totalRounds = 0;
        int totalWins = 0;
        
        while (playAgain) {
            totalRounds++;
            int secretNumber = random.nextInt(100) + 1; // Random number between 1-100
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;
            
            System.out.println("\nRound " + totalRounds);
            System.out.println("I've picked a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts.");
            
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("\nAttempt " + (attempts + 1) + "/" + maxAttempts + ": ");
                
                int guess;
                try {
                    guess = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    
                    attempts++;
                    
                    if (guess == secretNumber) {
                        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts!");
                        guessedCorrectly = true;
                        totalWins++;
                    } else if (guess < secretNumber) {
                        System.out.println("Too low! Try a higher number.");
                    } else {
                        System.out.println("Too high! Try a lower number.");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number!");
                    scanner.nextLine(); // Clear invalid input
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("\nGame over! The secret number was: " + secretNumber);
            }
            
            System.out.print("\nWould you like to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine().toLowerCase();
            playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
        }
        
        System.out.println("\nGame Summary:");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Total wins: " + totalWins);
        System.out.println("\nThanks for playing! Goodbye!");
        scanner.close();
    }
}