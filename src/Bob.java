import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        // Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //
        // Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        // He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        // He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        // He answers 'Whatever.' to anything else.
        // Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        Scanner sc = new Scanner(System.in);

        String bobQues = "Sure.";
        String bobExcl = "Whoa, chill out!";
        String bobEmpty = "Fine. Be that way!";
        String bobEverything = "Whatever.";

        System.out.println("=================");
        System.out.println("===Talk to Bob===");
        System.out.println("=================");
        System.out.println();
        System.out.println("Talk to him, ask him a question, or don't say anything at all: ");
        sc.useDelimiter("\n");
        String userInput = sc.nextLine();

        if (userInput.endsWith("?")) {
            System.out.printf("%s%n", bobQues);
        } else if (userInput.endsWith("!")) {
            System.out.printf("%s%n", bobExcl);
        } else if (userInput.equals("")) {
            System.out.printf("%s%n", bobEmpty);
        } else {
            System.out.printf("%s%n", bobEverything);
        }
    }
}
