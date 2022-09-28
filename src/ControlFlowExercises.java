import java.util.Scanner;

public class ControlFlowExercises {

    public static void table(int num) {
        System.out.println();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d\t   | %d\t     | %d\t\n", i, i * i, i * i * i);
        }
    }

    public static void main(String[] args) {
        // Display a table of powers.
        //
        // Prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered.
        // Ask if the user wants to continue.
        // Assume that the user will enter valid data.
        // Only continue if the user agrees to.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNum = sc.nextInt();
        table(userNum);
    }
}
