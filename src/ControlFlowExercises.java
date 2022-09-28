public class ControlFlowExercises {

    public static void main(String[] args) {
        // While Loop
        //
        // Create an integer variable i with a value of 5.
        // Create a while loop that runs so long as i is less than or equal to 15
        // Each loop iteration, output the current value of i, then increment i by one.
        // int i = 5;
        // while (i <= 15) {
            // System.out.println(i);
            // i++;
        // }
        for(int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        // Do While
        //
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        // Alter your loop to count backwards by 5's from 100 to -10.
        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
        // long j = 2;
        // do {
        //     System.out.println(j);
        //     j *= j;
        // } while (j <= 1000000);
        for (long j = 2; j < 1000000; j *= j) {
            System.out.println(j);
        }
    }
}
