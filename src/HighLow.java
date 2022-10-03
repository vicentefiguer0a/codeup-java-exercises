import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        // The specs for the game are:
        //
        // Game picks a random number between 1 and 100.
        // Prompts user to guess the number.
        // All user inputs are validated.
        // If user's guess is less than the number, it outputs "HIGHER".
        // If user's guess is more than the number, it outputs "LOWER".
        // If a user guesses the number, the game should declare "GOOD GUESS!"

        Scanner sc = new Scanner(System.in);

        int gameNum = (int)(Math.floor(Math.random() * (100 - 1 + 1) + 1));
        boolean notGuessed = true;
        int count = 0;

        System.out.println(" -------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("|             Guess My Number               |");
        System.out.println("|                                           |");
        System.out.println("| Rules:                                    |");
        System.out.println("| 1. You only get 10 guesses.               |");
        System.out.println("| 2. Have fun.                              |");
        System.out.println(" -------------------------------------------");
        System.out.println();

        do {
            System.out.printf("Number of guesses: %d%n", count);
            System.out.print("Guess my number: ");
            int userGuess = sc.nextInt();
            if (userGuess == gameNum) {
                System.out.println("GOOD GUESS!");
                notGuessed = false;
            } else if (count > 9) {
                System.out.println("Guessing limit has been reached.\nYOU LOST.");
                notGuessed = false;
            } else if (userGuess > gameNum) {
                count++;
                System.out.println("LOWER");
            } else if (userGuess < gameNum) {
                System.out.println("HIGHER");
                count++;
            }
        } while (notGuessed);
    }
}
