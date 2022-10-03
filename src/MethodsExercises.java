import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        // Initializing scanner for main method.
        Scanner sc = new Scanner(System.in);

        // Basic Arithmetic
        System.out.printf("%d%n", add(4, 4));
        System.out.printf("%d%n", subtract(10, 5));
        System.out.printf("%d%n", multiply(5, 4));
        System.out.printf("%d%n", divide(10, 2));
        System.out.printf("%d%n", modulus(10, 4));

        // Calculate the factorial of a number.
        boolean userContinue = false;
        do {
            long factorial = 1;
            int userInput = getInteger(1, 10);
            System.out.printf("Your number is: %d%n", userInput);
            System.out.print("Would you like to continue? [y / n]: ");
            String keepGoing = sc.nextLine();
            if (keepGoing.equalsIgnoreCase("y") || keepGoing.equalsIgnoreCase("yes")) {
                userContinue = true;
                // If user wants to continue, display factorial here.
                for (int i = 1; i <= userInput; i++) {
                    factorial *= i;
                    System.out.printf("%d! = %d\t = %d%n", i, i, factorial);
                }
            } else if (keepGoing.equalsIgnoreCase("n") || keepGoing.equalsIgnoreCase("no")) {
                userContinue = false;
                System.out.println("Thank you, come again!");
            }
        } while (userContinue);

        // Dice App
        // Create an application that simulates dice rolling.
        //
        // Ask the user to enter the number of sides for a pair of dice.
        // Prompt the user to roll the dice.
        // "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        // Use static methods to implement the method(s) that generate the random numbers.
        // Use the .random method of the java.lang.Math class to generate random numbers.

        do {
            System.out.print("Enter the number of sides you want for a pair of dice: ");
            int sides = sc.nextInt();
            System.out.print("Roll dice? [y / n]: ");
            sc.nextLine();
            String roll = sc.nextLine();
            if (roll.equalsIgnoreCase("y") || roll.equalsIgnoreCase("yes")) {
                userContinue = true;
                System.out.printf("Dice 1: %d%n", (int)(Math.floor(Math.random() * (sides - 1 + 1) + 1)));
                System.out.printf("Dice 2: %d%n", (int)(Math.floor(Math.random() * (sides - 1 + 1) + 1)));
                System.out.print("Would you like to continue? [y / n]: ");
                String diceContinue = sc.nextLine();
                if (diceContinue.equalsIgnoreCase("y") || diceContinue.equalsIgnoreCase("yes")) {
                    userContinue = true;
                } else if (diceContinue.equalsIgnoreCase("n") || diceContinue.equalsIgnoreCase("no")) {
                    System.out.println("Come again.");
                    userContinue = false;
                }
            } else if (roll.equalsIgnoreCase("n") || roll.equalsIgnoreCase("no")) {
                userContinue = false;
                System.out.println("Then why did you choose the number of sides for your dice if you're not gonna roll?");
                System.out.println("Exiting...");
                System.exit(0);
            }
        } while (userContinue);
    }

    // Create method that adds two numbers.
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Create method that subtracts two numbers.
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Create method that multiplies two numbers.
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Create method that divides two numbers.
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    // Create method that returns modulus of two numbers.
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    // Create a method that validates that user input is in a certain range
    // and returns that input as an integer if it is within the given range.
    // If not, prompt the user to input their number again until the input is within range.
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        // Using recursion to prompt user again if userInput number is invalid.
        if (userInput < 1 || userInput > 10) {
            System.out.println("Invalid number");
            userInput = getInteger(1, 10);
        }
        return userInput;
    }
}


// Food for thought: What happens if we try to divide by zero? What should happen?
// - I get an error of "Create breakpoint: / by zero"