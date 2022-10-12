package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
        return total / grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
