package grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Object> students = new HashMap<>();

        // Creating student objects and adding them to "students" hashmap with GitHub username as key.
        Student mike = new Student("Mike");
        mike.addGrade(90);
        mike.addGrade(100);
        mike.addGrade(76);
        students.put("flamingomike1954", mike);

        Student john = new Student("John");
        john.addGrade(88);
        john.addGrade(63);
        john.addGrade(77);
        students.put("johnnyboy99", john);

        Student preston = new Student("Preston");
        preston.addGrade(100);
        preston.addGrade(100);
        preston.addGrade(96);
        students.put("pppreston", preston);

        Student corey = new Student("Corey");
        corey.addGrade(84);
        corey.addGrade(76);
        corey.addGrade(76);
        students.put("coreycodes", corey);

        // CLI
        System.out.println("+---------------------------+");
        System.out.println("|          GRADES           |");
        System.out.println("|        APPLICATION        |");
        System.out.println("+---------------------------+");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students: ");
        System.out.println();
        System.out.println("|flamingomike| |johnnyboy| |pppreston| |coreycodes|");
        System.out.println();

        boolean userContinue = false;
        do {
            System.out.println("What student would you like to see more information on?");
            String student = sc.nextLine();

            if (student.equalsIgnoreCase("flamingomike")) {
                System.out.printf("NAME: %s%n", mike.getName());
                System.out.printf("GITHUB USERNAME: flamingomike%n");
                System.out.printf("CURRENT AVERAGE: %.2f%n", mike.getGradeAverage());
                System.out.println();
            }else if (student.equalsIgnoreCase("johnnyboy")) {
                System.out.printf("NAME: %s%n", john.getName());
                System.out.printf("GITHUB USERNAME: johnnyboy%n");
                System.out.printf("CURRENT AVERAGE: %.2f%n", john.getGradeAverage());
                System.out.println();
            } else if (student.equalsIgnoreCase("pppreston")) {
                System.out.printf("NAME: %s%n", preston.getName());
                System.out.printf("GITHUB USERNAME: pppreston%n");
                System.out.printf("CURRENT AVERAGE: %.2f%n", preston.getGradeAverage());
                System.out.println();
            } else if (student.equalsIgnoreCase("coreycodes")) {
                System.out.printf("NAME: %s%n", corey.getName());
                System.out.printf("GITHUB USERNAME: coreycodes%n");
                System.out.printf("CURRENT AVERAGE: %.2f%n", corey.getGradeAverage());
                System.out.println();
            } else if (!student.equalsIgnoreCase("flamingomike")|| !student.equalsIgnoreCase("johnnyboy")|| !student.equalsIgnoreCase("pppreston")|| !student.equalsIgnoreCase("coreycodes")) {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\"%n", student);
            }

            System.out.println("Would you like to see another student? [y / n]");
            String anotherStudent = sc.nextLine();
            if (anotherStudent.equalsIgnoreCase("y") || anotherStudent.equalsIgnoreCase("yes")) {
                userContinue = true;
            } else if (anotherStudent.equalsIgnoreCase("n") || anotherStudent.equalsIgnoreCase("no")) {
                userContinue = false;
                System.out.println("Goodbye, have a barely good day.");
            }
        } while (userContinue);
    }
}
