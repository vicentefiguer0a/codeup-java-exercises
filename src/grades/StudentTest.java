package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addGrade(80);
        bob.addGrade(80);
        System.out.println(bob.getGrades());
        System.out.println(bob.getGradeAverage());

        Student mike = new Student("Mike");
        mike.addGrade(45);
        mike.addGrade(70);
        System.out.println(mike.getGrades());
        System.out.println(mike.getGradeAverage());

    }
}
