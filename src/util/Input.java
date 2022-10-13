package util;
import java.util.Scanner;
import java.util.ArrayList;

public class Input {

    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt() {
        try {
            scanner.nextInt();
        } catch(NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please enter a number with the data type of integer.");
        }
        return scanner.nextInt();
    }

    public static double getDouble() {
        try {
            scanner.nextDouble();
        } catch(NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please enter a number with the data type of double.");
        }
        return scanner.nextDouble();
    }

    public static int getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d: ", min, max);
        int userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            userNum = getInt(min, max);
        }
        return userNum;
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Give me a number between %.1f and %.1f: ", min, max);
        double userNum = scanner.nextDouble();
        if (userNum < min || userNum > max) {
            getDouble(min, max);
        }
        return userNum;
    }
}
