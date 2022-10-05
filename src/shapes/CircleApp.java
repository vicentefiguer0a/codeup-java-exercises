package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        Double userRadius = Input.getDouble();
        Circle circle = new Circle(userRadius);
        System.out.printf("Your circle has a circumference of: %.1f%nYour circle has an area of: %.1f", circle.getCircumference(), circle.getArea());
    }
}
