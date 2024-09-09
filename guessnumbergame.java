import java.util.Random;
import java.util.Scanner;
public class guessnumbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        
        int numberToGuess = random.nextInt(100) + 1;

        
        int userGuess = 0;

        
        System.out.println("Guess the number (between 1 and 100):");

        userGuess = scanner.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You guessed the correct number.");
        } else if (userGuess < numberToGuess) {
            System.out.println("Your guess is too low. The number was " + numberToGuess + ".");
        } else {
            System.out.println("Your guess is too high. The number was " + numberToGuess + ".");
    
        scanner.close();
    }
    
}}
