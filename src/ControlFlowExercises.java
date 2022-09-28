public class ControlFlowExercises {

    public static void main(String[] args) {
        // Fizzbuzz
        //
        // One of the most common interview questions for entry-level programmers is the FizzBuzz test.
        // Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        // Write a program that prints the numbers from 1 to 100.
        // For multiples of three: print “Fizz” instead of the number.
        // For the multiples of five: print “Buzz”.
        // For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            System.out.println(i);
        }
    }
}
