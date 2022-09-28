import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        // Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
        // What happens if you input something that is not an integer?
        // - Compiler returns you an error when input is something other than integer.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        // Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        // What happens if you enter less than 3 words?
        // - It just keeps going to a new line until a character is pressed, and then it allows you to go to the next prompt.
        // What happens if you enter more than 3 words?
        // - It'll ignore anything after the third word of your input.
        System.out.print("Enter your first word: ");
        String userInput1 = scanner.next();
        System.out.print("Enter your second word: ");
        String userInput2 = scanner.next();
        System.out.print("Enter your third word: ");
        String userInput3 = scanner.next();
        System.out.printf("Your first word was: %s%nYour second word was: %s%nYour third word was: %s%n", userInput1, userInput2, userInput3);

        scanner.nextLine();

        // Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
        // Then, display that sentence back to the user.
        // Do you capture all the words?
        // - No, I only capture the first word.
        System.out.print("Enter a sentence: ");
        String userStr = scanner.nextLine();
        System.out.printf("Your sentence is: %s%n", userStr);

        // Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        // Display the area and perimeter of that classroom.
        System.out.print("Enter LENGTH of classroom: ");
        double classLength = scanner.nextDouble();
        System.out.print("Enter WIDTH of classroom: ");
        double classWidth = scanner.nextDouble();
        System.out.print("Enter HEIGHT of classroom: ");
        double classHeight = scanner.nextDouble();
        System.out.printf("The area of the classroom is: %.2f\nThe perimeter of the classroom is: %.2f\nThe volume of the classroom is: %.2f\n", area(classLength, classWidth), perimeter(classLength, classWidth), volume(classLength, classWidth, classHeight));
    }

    public static double perimeter(double length, double width) {
        // The perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        return (length * 2) + (width * 2);
    }

    public static double area(double length, double width) {
        // The area of a rectangle is equal to the length times the width.
        return length * width;
    }

    public static double volume(double length, double width, double height) {
        // Volume formula: length * width * height
        return length * width * height;
    }
}
