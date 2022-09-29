import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        // Convert given number grades into letter grades.
        //
        // Prompt the user for a numerical grade from 0 to 100.
        // Display the corresponding letter grade.
        // Prompt the user to continue.
        // Assume that the user will enter valid integers for the grades.
        // The application should only continue if the user agrees to.
        // Grade Ranges:
        //
        // A : 100 - 88
        // B : 87 - 80
        // C : 79 - 67
        // D : 66 - 60
        // F : 59 - 0
        boolean keepGoing = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a numerical grade from 0 to 100: ");
            int userNum = sc.nextInt();
            if (userNum >= 88 && userNum <= 100) {
                System.out.println("A");
                System.out.println();
            } else if (userNum >= 80 && userNum <= 87) {
                System.out.println("B");
                System.out.println();
            } else if (userNum >= 67 && userNum <= 79) {
                System.out.println("C");
                System.out.println();
            } else if (userNum >= 60 && userNum <= 66) {
                System.out.println("D");
                System.out.println();
            } else if (userNum >= 0 && userNum <= 59) {
                System.out.println("F");
                System.out.println();
            }
            sc.nextLine();
            System.out.print("Would you like to continue? [y, n] ");
            String userContinue = sc.nextLine();

            if (userContinue.equalsIgnoreCase("y")) {
                keepGoing = true;
            }
        } while (keepGoing);
    }
}
