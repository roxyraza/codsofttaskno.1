import java.util.Random;
import java.util.Scanner;
public class guessnumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;

        System.out.println("Guess the number (between 1 and 100):");

        int userGuess = scanner.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else {
            System.out.println("Sorry, that's not correct. The number was " + numberToGuess + ".");
        }

        scanner.close();
    }
    
}
