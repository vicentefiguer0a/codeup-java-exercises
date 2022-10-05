package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

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

    public static int getInt(int min, int max) {
        System.out.printf("Give me a number between %d and %d: ", min, max);
        int userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            userNum = getInt(min, max);
        }
        return userNum;
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Give me a number between %.1f and %.1f: ", min, max);
        double userNum = scanner.nextDouble();
        if (userNum < min || userNum > max) {
            getDouble(min, max);
        }
        return userNum;
    }

    public static double getDouble() {
        return scanner.nextDouble();
    }
}
