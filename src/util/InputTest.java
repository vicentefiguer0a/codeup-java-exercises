package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a min: ");
        int min = sc.nextInt();
        System.out.println("Enter a max: ");
        int max = sc.nextInt();
        System.out.println(Input.getInt(min, max));

        System.out.println("Enter a min (double): ");
        double doubleMin = sc.nextDouble();
        System.out.println("Enter a max (double): ");
        double doubleMax = sc.nextDouble();
        System.out.println(Input.getDouble(doubleMin, doubleMax));


        System.out.println("Would you like to continue? [y / n]: ");
        sc.next();
        String userInput = sc.nextLine();
        System.out.println(Input.yesNo());
        Input.getInt();
        Input.getString();
        Input.getDouble();
    }
}
