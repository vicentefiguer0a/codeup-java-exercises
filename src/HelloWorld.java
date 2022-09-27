public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, world.");


        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);


        // Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myStr = "3.14159";
        System.out.println(myStr);
        // Change your code to assign a character value to myString. What do you notice?
        // The character "c" still gets printed in the console.
        // Change your code to assign the value 3.14159 to myString. What happens?
        // The string "3.14159" gets printed in the console but holds the data type of String.


        // Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        // You get a build output of "java: variable myNumber might not have been initialized"
        double myNumber = 3.14;
        System.out.println(myNumber);
        // Change your code to assign the value 3.14 to myNumber. What do you notice?
        // Code does not run, invalid data type.
        // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // Because like integer, long only takes numbers without decimals.
        // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        // Incompatible data type. It has to be initialized as double to fix.


        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);
        // int x = 5;
        // System.out.println(++x);
        // System.out.println(x);
        // What is the difference between the above code blocks? Explain why the code outputs what it does.
        // The first block of code prints the values "5" then "6" because "x" is printed and then incremented
        // versus the second block where "x" is incremented first and then printed.


        // Try to create a variable named class. What happens?
        // Trying to create a variable with a keyword will give you an error.
//        int class = 0;

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
        // How is the above example different from the code block below?
        // They're not any different.
        // int three = (int) "three";
        // What are the two different types of errors we are observing?
        // The string "three" cannot be casted to the class of Integer.


        // Rewrite the following expressions using the relevant shorthand assignment operators:
        // int x = 4;
        // x = x + 5;
        // x += 5; (Reassignment)
        // int x = 3;
        // int y = 4;
        // y = y * x;
        // y *= x; (Reassignment)
        // int x = 10;
        // int y = 2;
        // x = x / y;
        // y = y - x;
        // x /= y; (Reassignment)
        // y -= x; (Reassignment)


        // What happens if you assign a value to a numerical variable
        // that is larger (or smaller) than the type can hold?
        // What happens if you increment a numeric variable past the type's capacity?
        // It will give it its opposite value.
    }
}
