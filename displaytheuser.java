import java.util.Scanner; 
import java.util.Random; 
public class displaytheuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        int totalRounds = 0;
        int roundsWon = 0;
        int totalAttempts = 0;
        
        while (playAgain) {
            
            int lowerBound = 1;
            int upperBound = 100;
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

            int maxAttempts = 5;
            totalRounds++;
            int attemptsTaken = 0;

            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + ". You have " + maxAttempts + " attempts.");

            boolean hasGuessedCorrectly = false;
            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                attemptsTaken++;
                System.out.print("Attempt " + attempt + ": ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    hasGuessedCorrectly = true;
                    roundsWon++;
                    break; 
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                if (attempt == maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
                }
            }

            totalAttempts += attemptsTaken;

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            playAgain = response.equals("yes");
        }
        scanner.close();
        
        
        System.out.println("\nGame Over!");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println("Total Attempts Taken: " + totalAttempts);
        
        if (totalRounds > 0) {
            double winRate = (double) roundsWon / totalRounds * 100;
            System.out.printf("Winning Percentage: %.2f%%\n", winRate);
        }

        System.out.println("Thanks for playing!");
    }

    
}
